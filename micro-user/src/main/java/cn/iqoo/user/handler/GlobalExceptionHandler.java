package cn.iqoo.user.handler;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局处理404,500等错误，返回json格式数据
 *
 * @author jonath@163.com
 * @date 2018/5/7 18:28
 * @see
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * 重写通用异常处理，以便返回json数据
     *
     * @param ex
     * @param body
     * @param headers
     * @param status
     * @param request
     * @return
     * @see #handleException(Exception, WebRequest)
     */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body,
                                                             HttpHeaders headers, HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }
        if (body == null) {
            body = responseData(status);
        }
        return new ResponseEntity(body, headers, status);
    }

    /**
     * 用spring的方式处理自定义异常，此处统一设置了 HttpStatus 为 510
     *
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, HttpMessageConversionException.class})
    public ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) {
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.NOT_EXTENDED;
        Map<String, Object> responseBody = responseData(status, ex.getMessage());
        return handleExceptionInternal(ex, responseBody, headers, status, request);
    }

    /**
     * 定义返回数据类型
     *
     * @param httpStatus http状态
     * @return Map
     * @date: 2018/5/15 22:01
     * @author: jonath@163.com
     */
    private Map<String, Object> responseData(HttpStatus httpStatus) {
        return this.responseData(httpStatus, null);
    }

    /**
     * 定义返回数据类型
     *
     * @param httpStatus
     * @param message
     * @return map
     * @date: 2018/5/15 22:06
     * @author: jonath@163.com
     */
    private Map<String, Object> responseData(HttpStatus httpStatus, String message) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", httpStatus.value());
        map.put("data", httpStatus);
        map.put("message", StringUtils.isBlank(message) ? httpStatus.name() : message);
        return map;
    }
}

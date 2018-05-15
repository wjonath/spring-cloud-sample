package com.hhly.sns.h5.handler;

import com.hhly.base.exception.APIException;
import com.hhly.sns.res.lang.constants.Message;
import com.hhly.sns.util.SNSResultUtil;
import com.hhly.sns.vo.SNSResult;
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
			body = new SNSResult<>(String.valueOf(status.value()), status.name());
		}
		return new ResponseEntity(body, headers, status);
	}

	/**
	 * 用spring的方式处理自定义异常，此处统一设置了 HttpStatus 为 503
	 *
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler({APIException.class, MethodArgumentTypeMismatchException.class, HttpMessageConversionException.class})
	public ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) {
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.SERVICE_UNAVAILABLE;
		SNSResult responseBody = new SNSResult();
		if (ex instanceof APIException) {
			responseBody = SNSResultUtil.getResult(((APIException) ex).getCode(), ex.getMessage());
		} else if (ex instanceof MethodArgumentTypeMismatchException) {
			responseBody = SNSResultUtil.getResult(Message.RESULT_4002, ((MethodArgumentTypeMismatchException) ex).getName());
		} else if (ex instanceof HttpMessageConversionException) {
			responseBody = SNSResultUtil.getResult(Message.RESULT_11003, ex.getMessage());
		}
		return handleExceptionInternal(ex, responseBody, headers, status, request);
	}

}

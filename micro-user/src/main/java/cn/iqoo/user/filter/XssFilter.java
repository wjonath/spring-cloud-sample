/*
 * @Project Name: ip-java-web-servers
 * @File Name: XssRequestWrapper
 * @Package Name: com.hhly.sns.org.cms.filter
 * @Date: 2017/5/18 16:53
 * @Creator: chenghb-799
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package cn.iqoo.user.filter;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * XSS过滤器
 * @date 2017/8/5 11:07
 * @author guoya-420
 * @since 1.0.0
 */
@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*", filterName = "xssFilter")
public class XssFilter implements Filter {

    @SuppressWarnings("unused")
    private FilterConfig filterConfig;

    @Override
    public void destroy() {
        this.filterConfig = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

}
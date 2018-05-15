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

package com.hhly.sns.h5.filter;

import com.hhly.sns.h5.sys.ApplicationContextHelper;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;

/**
 * XSS过滤器
 * @date 2017/8/5 11:07
 * @author guoya-420
 * @since 1.0.0
 */
@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*", filterName = "xssFilter")public class XssFilter implements Filter {

	@SuppressWarnings("unused")
	private FilterConfig filterConfig;

	public void destroy() {
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
						 FilterChain chain) throws IOException, ServletException {
		chain.doFilter(new RequestWrapper((HttpServletRequest) request), response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

}
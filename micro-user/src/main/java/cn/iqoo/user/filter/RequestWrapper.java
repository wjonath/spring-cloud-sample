/*
 * @project name: spring-cloud-sample
 * @file name: RequestWrapper
 * @package Name: cn.iqoo.user.filter
 * @date: 2018/5/15 17:39
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.user.filter;

import ch.qos.logback.core.spi.ScanException;
import com.sun.xml.internal.ws.policy.PolicyException;
import org.owasp.validator.html.AntiSamy;
import org.owasp.validator.html.CleanResults;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.security.Policy;
import java.util.Iterator;
import java.util.Map;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/15 17:39
 * @see
 */
public class RequestWrapper extends HttpServletRequestWrapper {

	public RequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<String,String[]> getParameterMap(){
		Map<String,String[]> request_map = super.getParameterMap();
		Iterator iterator = request_map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry me = (Map.Entry)iterator.next();
			//System.out.println(me.getKey()+":");
			String[] values = (String[])me.getValue();
			for(int i = 0 ; i < values.length ; i++){
				System.out.println(values[i]);
				values[i] = xssClean(values[i]);
			}
		}
		return request_map;
	}


	private String xssClean(String value) {
		AntiSamy antiSamy = new AntiSamy();
		try {
			Policy policy = Policy.getInstance("xml/antisamy-myspace.xml", null);
			//CleanResults cr = antiSamy.scan(dirtyInput, policyFilePath);
			final CleanResults cr = antiSamy.scan(value, policy);
			//安全的HTML输出
			return cr.getCleanHTML();
		} catch (ScanException e) {
			e.printStackTrace();
		} catch (PolicyException e) {
			e.printStackTrace();
		}
		return value;
	}
}

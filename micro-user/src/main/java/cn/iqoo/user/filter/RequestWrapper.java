
package cn.iqoo.user.filter;

import ch.qos.logback.core.spi.ScanException;
import lombok.extern.slf4j.Slf4j;
import org.owasp.validator.html.AntiSamy;
import org.owasp.validator.html.CleanResults;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.security.NoSuchAlgorithmException;
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
@Slf4j
public class RequestWrapper extends HttpServletRequestWrapper {

	public RequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map<String,String[]> getParameterMap(){
		Map<String,String[]> requestMap = super.getParameterMap();
		Iterator iterator = requestMap.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry me = (Map.Entry)iterator.next();
			String[] values = (String[])me.getValue();
			for(int i = 0 ; i < values.length ; i++){
				System.out.println(values[i]);
				values[i] = xssClean(values[i]);
			}
		}
		return requestMap;
	}


	private String xssClean(String value) {
		AntiSamy antiSamy = new AntiSamy();
		try {
			Policy policy = Policy.getInstance("xml/antisamy-myspace.xml", null);
			final CleanResults cr = antiSamy.scan(value, policy);
			return cr.getCleanHTML();
		} catch (ScanException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return value;
	}
}

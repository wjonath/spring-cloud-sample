package cn.iqoo.user.filter;

import lombok.extern.slf4j.Slf4j;
import org.owasp.validator.html.AntiSamy;
import org.owasp.validator.html.CleanResults;
import org.owasp.validator.html.Policy;
import org.owasp.validator.html.PolicyException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Iterator;
import java.util.Map;

/**
 * TODO
 *
 * @author jonath@163.com
 * @date 2018/5/15 17:39
 */
@Slf4j
public class RequestWrapper extends HttpServletRequestWrapper {

    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public Map<String, String[]> getParameterMap() {
        Map<String, String[]> requestMap = super.getParameterMap();
        Iterator iterator = requestMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            String[] values = (String[]) me.getValue();
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
                values[i] = xssClean(values[i]);
            }
        }
        return requestMap;
    }


    private String xssClean(String value) {
        AntiSamy antiSamy = new AntiSamy();
        try {
            Policy policy = Policy.getInstance("xml/antisamy-myspace.xml");
            final CleanResults cr = antiSamy.scan(value, policy);
            return cr.getCleanHTML();
        } catch (org.owasp.validator.html.ScanException e) {
            e.printStackTrace();
        } catch (PolicyException e) {
            e.printStackTrace();
        }
        return value;
    }
}

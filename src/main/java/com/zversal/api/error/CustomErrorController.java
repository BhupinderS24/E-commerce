package com.zversal.api.error;

import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.zversal.api.error.ErrorInfo;

/**
 * This class exposes the REST API for the system.
 * @author bhupinder
 *
 */
@RestController
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	@Autowired
	private ErrorAttributes errorAttributes;

	@RequestMapping(value = PATH)
	private ErrorInfo error(HttpServletResponse response, WebRequest webrequest) {
		return new ErrorInfo(response.getStatus(), getErrorAttributes(webrequest, false));
	}

	private Map<String, Object> getErrorAttributes(WebRequest webrequest, boolean includeStackTrace) {
		return errorAttributes.getErrorAttributes(webrequest, includeStackTrace);
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}

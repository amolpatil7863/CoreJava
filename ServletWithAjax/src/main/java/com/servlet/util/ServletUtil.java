package com.servlet.util;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public class ServletUtil {

	public JSONObject constructJson(HttpServletRequest request) {
		JSONObject valueObject = new JSONObject();

		try {
			Enumeration<String> parameters = request.getParameterNames();

			while (parameters.hasMoreElements()) {
				String paramNames = (String) parameters.nextElement();
				String[] paramValues = request.getParameterValues(paramNames);
				for (int i = 0; i < paramValues.length; i++) {
					if (!paramValues[i].equalsIgnoreCase("")) {
						valueObject.put(paramNames, paramValues[i].trim());
					}

				}
			}
			return valueObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

package com.ajax.test.util;

import javax.servlet.http.HttpServletRequest;

public class PasrURI {

	public static String getCmd(HttpServletRequest request) {
		int idx = request.getRequestURI().lastIndexOf("/");
		if(idx!=-1) {
			return request.getRequestURI().substring(idx+1);
		}
		return "";
	}
}

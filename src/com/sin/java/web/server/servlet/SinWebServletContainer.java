package com.sin.java.web.server.servlet;

import com.sin.java.web.server.BaseHandler;
import com.sin.java.web.server.exception.WebException401Unauthorized;
import com.sin.java.web.server.servlet.test.TestServlet;

public class SinWebServletContainer extends BaseHandler{
	public String handle() throws WebException401Unauthorized{
		
		
		TestServlet ts = new TestServlet();
//		return getRequestHeader().getPath();
		throw new WebException401Unauthorized(this, this.webServer);
//		return "";
	}
}

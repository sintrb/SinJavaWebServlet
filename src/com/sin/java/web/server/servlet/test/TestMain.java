package com.sin.java.web.server.servlet.test;

import com.sin.java.web.server.WebServer;

public class TestMain {


	public static void main(String[] args) {
		WebServer server = new WebServer(9011);
		
		server.addHandler(".*", "com.sin.java.web.server.servlet.ServletContainer.handle");
		
		server.start();
	}
}

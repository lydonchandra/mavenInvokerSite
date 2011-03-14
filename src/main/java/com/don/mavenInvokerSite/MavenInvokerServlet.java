package com.don.mavenInvokerSite;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.don.mavenInvoker.MavenInvoker;

public class MavenInvokerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException
    {
		MavenInvoker invoker = new MavenInvoker();
		invoker.runMaven( new File("/Users/lydonchandra/geonetwork-workspace/mavenInvokerSite/src/main/webapp/WEB-INF/tools/apache-maven-3.0.3"), 
						  new File("/Users/lydonchandra/geonetwork-workspace/mavenInvokerSite/src/main/webapp/WEB-INF/testWarProject/pom.xml"), 
						  Arrays.asList("clean", "package" ));
    }

	
}

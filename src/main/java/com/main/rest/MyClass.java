package com.main.rest;



import javax.inject.Inject;
import javax.ws.rs.core.Context;

import org.apache.http.HttpRequest;
import org.jboss.resteasy.plugins.guice.RequestScoped;

@RequestScoped
public class MyClass {

	@Inject @Context
	private HttpRequest request;
}

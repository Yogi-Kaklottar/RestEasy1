package com.main.rest;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class MyServletContextListener extends GuiceResteasyBootstrapServletContextListener{
		@Override
		protected List<? extends Module> getModules(ServletContext context) {
			// TODO Auto-generated method stub
			return Arrays.asList(new JpaPersistModule("PERSISTENCE_UNIT_NAME"),new HelloModule());
		}
		@Override
		protected void withInjector(Injector injector) {
		// TODO Auto-generated method stub
			injector.getInstance(PersistService.class).start();
		}
}

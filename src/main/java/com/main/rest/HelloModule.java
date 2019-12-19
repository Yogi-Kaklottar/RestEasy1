package com.main.rest;

import com.google.inject.Binder;
import com.google.inject.Module;

public class HelloModule implements Module{

	@Override
	public void configure(Binder binder) {
		binder.bind(MyService.class);
		binder.bind(StudentService.class).to(StudentImplement.class);
	}

}

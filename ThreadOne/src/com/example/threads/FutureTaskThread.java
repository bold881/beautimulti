package com.example.threads;

import java.util.concurrent.Callable;

public class FutureTaskThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "hello Callable";
	}

}

package com.example.threads;

public class MyThread extends Thread {
	private String name;
	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm a child thread, my name is " + this.name);
		super.run();
	}
}

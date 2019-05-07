package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.example.threads.FutureTaskThread;
import com.example.threads.MyThread;
import com.example.threads.ThreadRunnable;

public class Application {

	public static void main(String[] args) {
		// 继承Thread方式
		System.out.println("hello world!");
		
		MyThread myThread = new MyThread("daifeng");
		myThread.start();
		
		MyThread myThread2 = new MyThread("xiaoxiao");
		myThread2.start();
		
		// 实现Runnable方式
		ThreadRunnable task = new ThreadRunnable();
		Thread runnableTask1 = new Thread(task);
		runnableTask1.start();
		new Thread(task).start();
		
		// FutureTask方式
		FutureTask<String> futureTask = 
				new FutureTask<>(new FutureTaskThread());
		new Thread(futureTask).start();
		try {
			String ret = futureTask.get();
			System.out.println(ret);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}

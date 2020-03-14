package com.client;

import com.singleton.Singleton;

public class ClientTest {

	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());//both prints same instance which show that same object

	}
}

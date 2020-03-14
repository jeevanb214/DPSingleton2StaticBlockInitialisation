package com.singleton;

public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	static {
		try { 				// here we can create the instance by having the try catch but -->it is
							// intalizing before user request
			if (INSTANCE == null)
				INSTANCE = new Singleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {

		return INSTANCE;

	}

}

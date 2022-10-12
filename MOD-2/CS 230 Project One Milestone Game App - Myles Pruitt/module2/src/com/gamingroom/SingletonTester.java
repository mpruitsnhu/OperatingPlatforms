package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	private static SingletonTester instance = new SingletonTester();

	public static SingletonTester getInstance(){
		return instance;
	}

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIXME: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); 
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}
	}
}
/** The purpose of the singleton class is too restrict the instantiation of a class and that only one instance exists in the JVM
 * Singletons are mainly used for logging, drivers objects, caching, and thread pool.
 */
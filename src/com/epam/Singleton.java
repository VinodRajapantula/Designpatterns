package com.epam;

public class Singleton {
	
	private static Singleton singleton;
	private WebDriver driver;
	
	private Singleton(){
		
	}
	
	public static Singleton getSingleton() {
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public WebDriver createDrver(String driverName){
		
		if(driverName.equalsIgnoreCase("ie")){
			
			driver = new FirefoxDrver();
			
		}else if(driverName.equalsIgnoreCase("FF")){
			driver = new ChromeDrver();
		}
		
	}
	
	
	
	

}

package com.epam;

public class OsFactory {
	
	public Os getOs(String osName){
		if(osName.equalsIgnoreCase("Android")){
			return new Android();
		}else if(osName.equalsIgnoreCase("Ios")){
			return new Ios();
		}else {
			return new Windows();
		}

	}
	
}

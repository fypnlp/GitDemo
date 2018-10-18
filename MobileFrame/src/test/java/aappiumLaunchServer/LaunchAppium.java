package aappiumLaunchServer;

import java.io.File;

import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppium {
	
	private static AppiumServiceBuilder service;



	public static void main(String[] args){

	stopAppium();

	startAppium();

	stopAppium();



	}



	public static void startAppium(){

	System.out.println("Trying to start Appium Server!");

	service = new AppiumServiceBuilder().usingDriverExecutable(new File(" usr/local/bin/node")).

	withAppiumJS(new File(

"/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));

	service.build().start();

	System.out.println("Appium Server is at your service!");

	}



	public static void stopAppium(){

	System.out.println("Trying to stop appium Server!");

	try {

	service.build().stop();

	}catch (Exception e){

	System.out.println("Appuim server is already stopped!");

	}

	System.out.println("Appuim server is now shut down!");



	}	
	
	
	
	
	

}

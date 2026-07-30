package com.rays.oop.Interface;

public class BusinessMan implements RichMan,SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("help to others");
		
	}

	@Override
	public void earMoney() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("giving donation");
		
	}

	@Override
	public void party() {
		System.out.println("doing party");
		
	}
	

}

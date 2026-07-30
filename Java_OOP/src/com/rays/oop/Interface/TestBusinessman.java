package com.rays.oop.Interface;

public class TestBusinessman {
	public static void main(String[] args) {
		RichMan r= new BusinessMan();
		SocialWorker s= new BusinessMan();
		
		r.donation();
		r.earMoney();
		r.party();
		s.helpToOthers();
	}

}

package com.zak.isp.example.bad;


public class Main {

	public static void main(String[] args) {
		
		IClock icClock=new SimpleClock();
		icClock.setAlarm(10);
		icClock.startAlarm();
		System.out.println("Alarm completed");
		
		icClock=new AlarmClock();
		icClock.setAlarm(10);
		icClock.startAlarm();
		System.out.println("Alarm completed");
	}

}

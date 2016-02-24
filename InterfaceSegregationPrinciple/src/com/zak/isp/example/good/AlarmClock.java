package com.zak.isp.example.good;

import java.util.Date;

public class AlarmClock implements IAlarm ,IClock{

	private Date date;
	private Date alarmDate;
	
	public AlarmClock() {
		this.date=new Date();
	}
	
	@Override
	public Date getTime() {
		return date;
	}

	@Override
	public void setTime(long time) {
		this.date=new Date(time);
	}

	@Override
	public void setAlarm(long offset) {
		this.alarmDate=new Date(System.currentTimeMillis()+offset);
	}

	@Override
	public void startAlarm() {
		System.out.println("Alarm waiting..");
		while(true){
			if(this.alarmDate.after(new Date())){
				System.out.println("Tring tring .....");
				break;
			}
		}
	}
}

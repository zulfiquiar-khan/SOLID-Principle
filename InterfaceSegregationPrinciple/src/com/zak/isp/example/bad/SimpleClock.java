package com.zak.isp.example.bad;

import java.util.Date;

public class SimpleClock implements IClock {
	
	private Date date;
	
	public SimpleClock() {
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
		
	}

	@Override
	public void startAlarm() {
		
	}

}
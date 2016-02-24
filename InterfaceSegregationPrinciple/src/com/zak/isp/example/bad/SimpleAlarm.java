package com.zak.isp.example.bad;

import java.util.Date;

public class SimpleAlarm implements IClock {

	private Date alarmDate;
	
	@Override
	public Date getTime() {
		return null;
	}

	@Override
	public void setTime(long time) {

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

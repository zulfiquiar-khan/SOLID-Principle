package com.zak.dip.example.bad;

public class Copy {
	
	public void copy(KeyBoardReader keyBoardReader,PrintWriter printWriter){
		String data=keyBoardReader.read();
		printWriter.write(data);
	}
}

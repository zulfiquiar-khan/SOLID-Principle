package com.zak.lsp.example.bad.three;


//This task cannot be closed once started
public class ProjectTask extends Task{
	
	public void start(){
		super.start();
	}
	
	public void close() throws Exception{
		if(super.isStatus()==Status.STARTED)
			throw new Exception("Cannot close this task");
	}

}

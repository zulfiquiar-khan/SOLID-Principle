package com.zak.lsp.example.bad.one;

public class ClientCode {
	
	public static void main(String args[]) {
		Rectangle r=StaticFactory.getRectangle();
		r.setHeight(10);
		r.setWidth(20);		
		System.out.println("Area : "+r.getArea());
	}

}

package com.zak.lsp.example.good.one;

public class Square implements IArea{
	
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return this.side*this.side;
	}
	
	
	
}

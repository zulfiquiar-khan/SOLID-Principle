package com.zak.lsp.example.good.two;

public class Plotter {

	public static void main(String[] args) {
		Graph3D g=new Graph3D();
		g.draw(10, 10, 10);
		g.draw(10,10);//This shows the violation of LSP
	}

}

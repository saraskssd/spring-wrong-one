package com.cts;
@FunctionalInterface
interface Add{
	public int getAdd(int a,int b);
}

public class rest {

	public static void main(String[] args) {
		Add a=(x,y)-> x+y;
		System.out.println(a.getAdd(29,20));// TODO Auto-generated method stub

	}

}

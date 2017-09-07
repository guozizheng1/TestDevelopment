package com.imooc.test;

public class Father {
	private String name;
	private int age;
	
	public Father(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Father fa1 = new Father("李明", 20);
		Father fa2 = new Father("李明", 20);
		boolean flag = fa1.equals(fa2);
		System.out.println(flag);
		

	}

}

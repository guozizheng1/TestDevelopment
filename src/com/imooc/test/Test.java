package com.imooc.test;

import com.imooc.work.DevelopmentWork;
import com.imooc.work.TestWork;
import com.imooc.work.Work;

public class Test {

	public static void main(String[] args) {
		System.out.print("父类信息测试：");
		Work w = new Work();
		System.out.println(w.work());
	
		System.out.print("测试工作类信息测试：");
	    TestWork tw = new TestWork("测试工作", 10, 5);
	    System.out.println(tw.work());
	    
		System.out.print("研发工作类信息测试：");
	    DevelopmentWork dw = new DevelopmentWork("研发工作", 1000, 10);
	    System.out.println(dw.work());

	}

}

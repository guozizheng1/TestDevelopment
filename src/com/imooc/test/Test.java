package com.imooc.test;

import com.imooc.work.DevelopmentWork;
import com.imooc.work.TestWork;
import com.imooc.work.Work;

public class Test {

	public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		Work w = new Work();
		System.out.println(w.work());
	
		System.out.print("���Թ�������Ϣ���ԣ�");
	    TestWork tw = new TestWork("���Թ���", 10, 5);
	    System.out.println(tw.work());
	    
		System.out.print("�з���������Ϣ���ԣ�");
	    DevelopmentWork dw = new DevelopmentWork("�з�����", 1000, 10);
	    System.out.println(dw.work());

	}

}

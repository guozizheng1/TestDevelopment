package com.imooc.work;

public class Work {
    // ���ԣ�����ming
    private String name ;

	// �޲ι��췽��
	public Work(){
	    
	}

	// ���ι��췽������ɹ������͵ĸ�ֵ
	public Work(String name){
	    this.name = name;
	}

   // ���е�get***/set***����������Է�װ
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

	// ������������������������Ϊ�����Ĺ���
	public String work() {
	    String str = "���Ĺ���";
		return str;
	}
}

package com.imooc.work;

public class DevelopmentWork extends Work {
	// ���ԣ���Ч����������Ŀǰû�н����Bug����
		private int codeLine;
		private int restBug;
		//��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
		public DevelopmentWork(String name, int codeLine, int restBug){
		    this.setName(name);
		    this.codeLine = codeLine;
		    this.restBug = restBug;
		}
	    // ���е�get***/set***����������Է�װ
	    public int getCodeLine(){
	        return codeLine;
	    }
	    //�жϴ��������������0������ǿ�Ƹ�ֵΪ0
	    public void setCodeLine(int codeLine){
	        if(codeLine<0){
	            this.codeLine = 0;
	        }else{
	            this.codeLine = codeLine;
	        }
	    }
	    
	    public int getRestBug(){
	        return restBug;
	    }
	    //�ж�û�н����bug�����������0������ǿ�Ƹ�ֵΪ0
	    public void setRestBug(int restBug){
	        if(restBug<0){
	            this.restBug = 0;
	        }else{
	            this.restBug = restBug;
	        }
	    }
		
		// ��д���з�������������Ϊ��**���ձ��ǣ������д��**�д��룬Ŀǰ��Ȼ��**��bugû�н��������**�������������ṩ
		public String work() {
		    String str = this.getName() + "���ձ��ǣ������д��" + this.codeLine + "�д��룬Ŀǰ��Ȼ��" + this.restBug + "��bugû�н����";
	        return str;
		}
}

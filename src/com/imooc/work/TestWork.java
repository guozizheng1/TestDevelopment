package com.imooc.work;

public class TestWork extends Work {
	//���ԣ���д�Ĳ����������������ֵ�Bug����
    private int caseNum;
    private int bugNum;
    // ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public TestWork(String name, int caseNum, int bugNum){
	    this.setName(name);
	    this.caseNum = caseNum;
	    this.bugNum = bugNum;
	}
    // ���е�get***/set***����������Է�װ
    public int getCaseNum(){
        return caseNum;
    }
    //�ж���������������ڻ����0������ǿ�Ƹ�ֵΪ0
    public void setCaseNum(int caseNum){
        if(caseNum<0){
            this.caseNum = 0;
        }else{
            this.caseNum = caseNum;
        }
    }
    
    public int getBugNum(){
        return bugNum;
    }
    //�ж�bug����������ڻ��ߵ���0������ǿ�Ƹ�ֵΪ0
    public void setBugNum(int bugNum){
        if(bugNum<0){
            this.bugNum = 0;
        }else{
            this.bugNum = bugNum;
        }
    }

	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**������������������**bug������**�������������ṩ
	public String work() {
        String str = this.getName() + "���ձ��ǣ������д��" + this.caseNum + 
        "������������������" + this.bugNum + "��bug";
        return str;
	}
}

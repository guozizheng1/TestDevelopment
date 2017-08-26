package com.imooc.work;

public class TestWork extends Work {
	//属性：编写的测试用例个数、发现的Bug数量
    private int caseNum;
    private int bugNum;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public TestWork(String name, int caseNum, int bugNum){
	    this.setName(name);
	    this.caseNum = caseNum;
	    this.bugNum = bugNum;
	}
    // 公有的get***/set***方法完成属性封装
    public int getCaseNum(){
        return caseNum;
    }
    //判断用例数量必须大于或等于0，否则强制赋值为0
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
    //判断bug数量必须大于或者等于0，否则强制赋值为0
    public void setBugNum(int bugNum){
        if(bugNum<0){
            this.bugNum = 0;
        }else{
            this.bugNum = bugNum;
        }
    }

	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String work() {
        String str = this.getName() + "的日报是：今天编写了" + this.caseNum + 
        "个测试用例，发现了" + this.bugNum + "个bug";
        return str;
	}
}

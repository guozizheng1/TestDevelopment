package com.imooc.work;

public class DevelopmentWork extends Work {
	// 属性：有效编码行数、目前没有解决的Bug个数
		private int codeLine;
		private int restBug;
		//编写构造方法，并调用父类相关赋值方法，完成属性赋值
		public DevelopmentWork(String name, int codeLine, int restBug){
		    this.setName(name);
		    this.codeLine = codeLine;
		    this.restBug = restBug;
		}
	    // 公有的get***/set***方法完成属性封装
	    public int getCodeLine(){
	        return codeLine;
	    }
	    //判断代码行数必须大于0，否则强制赋值为0
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
	    //判断没有解决的bug数量必须大于0，否则强制赋值为0
	    public void setRestBug(int restBug){
	        if(restBug<0){
	            this.restBug = 0;
	        }else{
	            this.restBug = restBug;
	        }
	    }
		
		// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
		public String work() {
		    String str = this.getName() + "的日报是：今天编写了" + this.codeLine + "行代码，目前任然有" + this.restBug + "个bug没有解决。";
	        return str;
		}
}

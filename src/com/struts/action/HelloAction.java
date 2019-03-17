package com.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

//action的三种编写方法；
//第一种类方法
/*public class HelloAction {

    public String execute(){
    	return "ok";
    }
}*/
//第二种 接口； com.opensymphony.xwork2.Action;
/*public class HelloAction  implements Action{
     @Override
    public String execute() throws Exception {
	   // TODO Auto-generated method stub
	    return null;
      }
}*/
//第三种 继承；
public class HelloAction extends ActionSupport{
	
	  public String execute(){
	    	return "ok";
	    }
}
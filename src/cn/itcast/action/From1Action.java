package cn.itcast.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.struts.entity.User;

public class From1Action extends ActionSupport {
	   private String username;
	   private String password;
	   private String address;
	   
    public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

public String execute(){
//	 //第一种方式 使用ActionContext获取值；
//	 //1获取ActionContext对象；
//	 ActionContext context=ActionContext.getContext();
//	 //2调用方法得到表单数据
//	 //key 为表单name的值。value为输入值;
//	 Map<String,Object> map=context.getParameters();
//	 Set<String> keys=map.keySet();
//	 for(String key:keys){
//		 //根据key得到value;为数组
//		 Object[] obj=(Object[])map.get(key);
//		 System.out.println(Arrays.toString(obj));
//	 }
//	 
//	 //第二种方式 使用ServletActionContext类获取；
//	  //1.使用ServletActionContext获取request对象；
//	  HttpServletRequest request=ServletActionContext.getRequest();
//	  
//	  //2 调用request里边的方法得到结果；
//	  String userName=request.getParameter("username");
//	  String password=request.getParameter("password");
//	  String address=request.getParameter("address");
//	  System.out.println(userName+"<br>"+password+"<br>"+address);
	 
//	 //操作三个域对象；request session servletContext;
//	 //1、request域；
//	 HttpServletRequest request=ServletActionContext.getRequest();
//	 request.setAttribute("req", "reqvalue");
//	 
//	 //2、session域；
//	 HttpSession session=request.getSession();
//	 session.setAttribute("sess","sessvalue");
//	 
//	 //3、ServletContext域
//	 ServletContext context=ServletActionContext.getServletContext();
//	 context.setAttribute("context", "contextvalue");
	 

	 //Struts2提供的表单数据封装方法；
//	 //使用ServletActionContext获取表单对象封装到实体类User中去；
//	 //1、获取表单数据；
//	 HttpServletRequest request=ServletActionContext.getRequest();
//	  String userName=request.getParameter("username");
//	  String password=request.getParameter("password");
//	  String address=request.getParameter("address");
//	  //2、封装表单数据到User中去；
//	  User user=new User();
//	  user.setUserName(userName);
//	  user.setAddress(address);
//	  user.setPassword(password);
//	  System.out.println(user);
	 
	 
	 //使用属性封装 获取表单数据
	  //1.定义变量，变量名与表单name值一至；
	  //生成get，set方法；
	  System.out.println(username+password+address);
	 return NONE;
 }
}

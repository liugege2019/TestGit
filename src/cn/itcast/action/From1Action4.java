package cn.itcast.action;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.struts.entity.User;
//表达式封装；
public class From1Action4 extends ActionSupport {
       //封装数据到list集合
	  private List<User> list;
	  
	   public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public String execute(){
			 for(User u:list){
		       System.out.println(u);
				 
			 }
			 return NONE;
		 }

}
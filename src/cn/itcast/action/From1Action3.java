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
//表达式封装；
public class From1Action3 extends ActionSupport {
	//1.声明实体类；
	   private User user;
	//2、生成实体类变量的set get方法；
	   public String execute(){

			  System.out.println(user);
			 return NONE;
		 }

		public User getUser() {
			return user;
		} 
	//3.在表单的name属性里边写表达式形式；

      public void setUser(User user) {
	       this.user = user;
       }
   }

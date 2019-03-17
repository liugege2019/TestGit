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
import com.opensymphony.xwork2.ModelDriven;

import cn.struts.entity.User;
//使用模型驱动方法获取表单数据
public class From1Action2 extends ActionSupport implements ModelDriven<User>{
  //实现getModel方法；
	//创建对象
	//要求：表单输入项的name值与实体类属性名一样；
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
public String execute(){
    System.out.println(user);
	 return NONE;
 }


}

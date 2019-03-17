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
//将数据封装到map集合中；
public class From1Action5 extends ActionSupport {
       private Map<String,User> map;
       
	   public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	public String execute(){
             Set<String> set=map.keySet();
             for(String key:set){
            	
            	 System.out.println(map.get(key));
             }
			  
			 return NONE;
		 }
   }

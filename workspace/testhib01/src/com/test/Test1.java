package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.po.User;

public class Test1 {
	public static void main(String[] args){
		//javabean实例化  
		User user = new User();  
		user.setId(16);  
		user.setName("zhangsan");  
		
		//保存操作  
		Configuration cfg = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build(); 
		SessionFactory sFactory = cfg.buildSessionFactory(serviceRegistry);
 
		Session session = sFactory.openSession();//session工厂打开一个session  
		Transaction t=session.beginTransaction();//保存操作需要在事务中进行  
		session.save(user);//保存  
		t.commit();//提交  
		session.close();  
		sFactory.close();  
	}
}

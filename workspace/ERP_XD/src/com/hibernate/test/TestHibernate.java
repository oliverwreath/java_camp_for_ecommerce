package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Goods;
import com.hibernate.model.Ruku;
import com.hibernate.model.Ruku_detail;
import com.hibernate.model.Sales;
import com.hibernate.model.Sales_detail;
import com.hibernate.model.Supplier;
import com.hibernate.model.User;

public class TestHibernate {
	public static void main(String[] args){
		//javabean实例化  
		User user = new User();  
		user.setId(16);  
		user.setName("zhangsan");  
		
		Goods goods = new Goods();  
		Ruku_detail ruku_detail = new Ruku_detail();  
		Ruku ruku = new Ruku();  
		Sales_detail sales_detail = new Sales_detail();  
		Sales sales = new Sales();  
		Supplier supplier = new Supplier();  
		
		//保存操作  
		Configuration cfg = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				cfg.getProperties()).build(); 
		SessionFactory sFactory = cfg.buildSessionFactory(serviceRegistry);
 
		Session session = sFactory.openSession();//session工厂打开一个session  
		Transaction t=session.beginTransaction();//保存操作需要在事务中进行  
		session.save(user);//保存  
		session.save(goods);//保存  
		session.save(ruku_detail);//保存  
		session.save(ruku);//保存  
		session.save(sales_detail);//保存  
		session.save(sales);//保存  
		session.save(supplier);//保存  
		t.commit();//提交  
		session.close();  
		sFactory.close();  
	}
}

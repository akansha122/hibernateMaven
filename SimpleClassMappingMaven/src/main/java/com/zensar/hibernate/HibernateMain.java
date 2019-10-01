package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class HibernateMain {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Product product = new Product();
		product.setProductId(1002);
		product.setName("PC");
		product.setBrand("dell");
		product.setPrice(8753.2f);
		session.save(product);
		transaction.commit();
		session.close();
	}
}
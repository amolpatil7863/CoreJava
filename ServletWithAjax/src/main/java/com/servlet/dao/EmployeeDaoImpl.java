package com.servlet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import com.servlet.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static SessionFactory factory;
	private Transaction tx = null;
	private Session session = null;

	public EmployeeDaoImpl() {
		super();
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = factory.openSession();
	}

	public void addEmp(Employee employee) {
		try {
			System.out.println("in add");
			session.beginTransaction();
			session.save(employee);
			tx.commit();
			session.close();
		} catch (Exception e) {

		}
	}

	public List<Employee> getEmployeeList() {
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		return list;
	}

}

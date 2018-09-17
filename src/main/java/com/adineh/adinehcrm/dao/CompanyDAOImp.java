package com.adineh.adinehcrm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adineh.adinehcrm.entity.Company;
@Repository
public class CompanyDAOImp implements CompanyDAO {

	@Autowired
	protected SessionFactory sessionFactory;
	private Session session = null;
	@Override
	public List<Company> getCompanyList() {
		session = sessionFactory.getCurrentSession();
		List<Company> company_list = session.createQuery("from Company").getResultList(); 
		return company_list;
	}

}

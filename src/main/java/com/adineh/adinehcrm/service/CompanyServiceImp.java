package com.adineh.adinehcrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adineh.adinehcrm.dao.CompanyDAO;
import com.adineh.adinehcrm.entity.Company;


@Service
@Transactional
public class CompanyServiceImp implements CompanyService{

	@Autowired
	private CompanyDAO companyDAO;
	
	@Override
	public List<Company> getCompanyList() {
		return companyDAO.getCompanyList();
	}

}

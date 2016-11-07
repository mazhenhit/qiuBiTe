package com.zhenma.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhenma.dao.EmployeeDAO;
import com.zhenma.model.EmployeeVO;
import com.zhenma.service.EmployeeManager;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	public List<EmployeeVO> getAllEmployees() {
		return dao.getAllEmployees();
	}
}

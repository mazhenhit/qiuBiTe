package com.zhenma.dao;

import java.util.List;

import com.zhenma.model.EmployeeVO;

public interface EmployeeDAO {
	public List<EmployeeVO> getAllEmployees();
}
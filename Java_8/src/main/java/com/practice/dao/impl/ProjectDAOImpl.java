package com.practice.dao.impl;

import com.practice.dao.interfaces.ProjectDAO;
import com.practice.datasource.DBUtils;

import java.util.List;

public class ProjectDAOImpl extends DBUtils implements ProjectDAO {


    public List getEmployees() {
        List employeeList = null;
        String query = " select * from test_employee_details ";
        try {
            employeeList = getJdbcTemplate().queryForList(query);
        } catch (Exception e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
        return employeeList;
    }
}

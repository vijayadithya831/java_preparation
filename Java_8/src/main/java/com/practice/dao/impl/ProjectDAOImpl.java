package com.practice.dao.impl;

import com.practice.dao.interfaces.ProjectDAO;
import com.practice.datasource.DBUtils;
import com.practice.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProjectDAOImpl extends DBUtils implements ProjectDAO {


    public List<Employee> getEmployees() {
        List<Employee> employeeList = null;
        String query = " SELECT * FROM test_employee_details ORDER BY employee_id FETCH FIRST 5 ROWS ONLY ";
        try {
            employeeList = getJdbcTemplate().query(query, new EmployeeRowMapper());
        } catch (Exception e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
        return employeeList;
    }

    static class EmployeeRowMapper implements RowMapper<Employee> {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setEmpId(rs.getString("EMPLOYEE_ID"));
            employee.setEmpName(rs.getString("EMPLOYEE_NAME"));
            employee.setAge(rs.getInt("AGE"));
            employee.setSalary(rs.getBigDecimal("SALARY"));
            employee.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));
            employee.setDept(rs.getString("DEPARTMENT"));
            employee.setCity(rs.getString("CITY"));
            employee.setGender(rs.getString("GENDER"));
            employee.setExperienceYears(rs.getInt("EXPERIENCE_YEARS"));
            employee.setIsActive(rs.getString("IS_ACTIVE"));
            return employee;
        }
    }
}

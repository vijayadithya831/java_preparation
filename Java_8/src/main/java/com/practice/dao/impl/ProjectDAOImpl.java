package com.practice.dao.impl;

import com.practice.dao.interfaces.ProjectDAO;
import com.practice.datasource.DBUtils;
import com.practice.model.Employee;
import com.practice.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProjectDAOImpl extends DBUtils implements ProjectDAO {


    public List<Employee> getEmployees() {
        List<Employee> employeeList = null;
        String query = " SELECT * FROM test_employee_details ORDER BY employee_id FETCH FIRST 10 ROWS ONLY ";
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

    public List<User> getUsers() {
        List<User> userList = null;
        String query = " SELECT * FROM USER_OBJECT ";
        try {
            userList = getJdbcTemplate().query(query, new UserRowMapper());
        } catch (Exception e) {
            System.out.println("Exception Occured");
            e.printStackTrace();

        }
        return userList;
    }

    static class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();

            user.setId(rs.getInt("USER_ID"));
            user.setUserame(rs.getString("USERNAME"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setEmail(rs.getString("EMAIL"));

            return user;
        }
    }

    public List<Employee> getEmployeeNameAndAge() {
        List<Employee> employeeList = null;
        String query = "SELECT EMPLOYEE_NAME, AGE FROM TEST_EMPLOYEE_DETAILS FETCH FIRST 3 ROWS ONLY";
        try {
            employeeList = getJdbcTemplate().query(query, new EmployeeNameRowMapper());
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e);
            e.printStackTrace();
        }
        return employeeList;
    }

    public class EmployeeNameRowMapper implements RowMapper<Employee> {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setEmpName(rs.getString("EMPLOYEE_NAME"));
            employee.setAge(rs.getInt("AGE"));
            return employee;
        }
    }
}

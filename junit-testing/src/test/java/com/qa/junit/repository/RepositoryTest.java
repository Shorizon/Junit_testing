package com.qa.junit.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.qa.junit.exception.EmployeeNotFoundException;
import com.qa.junit.exception.InvalidInputException;
import com.qa.junit.model.Employee;

public class RepositoryTest {


	
	/*
	 * To test Repository class
	 */
	
	Repository repository;
	
	@BeforeEach
	public void setUp() {
		this.repository = new Repository();
	}
	
	@AfterEach
	public void cleanUp() {
		this.repository = null;
	}
	
//	@Test
//	@DisplayName("getEmpById(id) -> Return Employee")
//	public void givenExistingId_whenGetEmployeeById_thenReturnEmployee() throws EmployeeNotFoundException, InvalidInputException {
//		//testing the code
//		//expected vs actual
//		Employee employee = this.repository.getEmployeeById(111);
//		assertNotNull(employee);
//		assertEquals("emp1", employee.getName());
//		assertEquals(32423.23,employee.getSalary());
//		
//	}
//	
//	@Test
//	@DisplayName("getEmployeeById(id) -> Throws EmployeeNotFoundException")
//	public void givenNonExistingId_whenGetEmployeeById_thenThrowEmployeeNotFoundException() {
//		
//		assertThrows(EmployeeNotFoundException.class, () -> this.repository.getEmployeeById(888) );
//	}
//	
//	@Test
//	@DisplayName("getEmployeeById(invalid) -> Throws InvalidInputException")
//	public void givenInvalidInputAsId_whenGetEmpoyeeById_thenThrowInvalidInputException() {
//		assertThrows(InvalidInputException.class, () -> this.repository.getEmployeeById(-100) );
//	}
	
	/*
	 * Write the test cases for getAllEmployees
	 * 
	 * 
	 */
	
	@Test
	@DisplayName("getAllEmployee(list) -> Throws InvalidInputException")
	public void givenEmptyList_whenGetAllEmployees_thenThrowInvalidInputException() {
		
		assertThrows(InvalidInputException.class, () -> this.repository.getAllEmployee() );
	}
	
	@Test
	@DisplayName("getAllEmployee() -> Return EmployeeList")
	public void whenGetAllEmployeeList_thenReturnEmployeeList() {
		List<Employee> employeeList = this.repository.getAllEmployee();
		assertNotNull(employeeList);
		assertEquals(10, employeeList.size());
		//assertEquals(32423.23,employee.getSalary());
	
	}
	
	
	
	/*
	 * Write the test cases for addEmployee(employee)
	 * 
	 */
	
	
}

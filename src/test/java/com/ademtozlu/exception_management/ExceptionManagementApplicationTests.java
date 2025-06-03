package com.ademtozlu.exception_management;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ademtozlu.dto.DtoEmployee;
import com.ademtozlu.service.IEmployeeService;
import com.ademtozlu.starter.ExceptionManagementStarter;

@SpringBootTest(classes =  {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("before methode funktioniert");
	}

	@Test
	public void testFindEmployeeById(){
DtoEmployee employee = employeeService.findEmployeeById(4L);
assertNotNull(employee);
assertEquals(4, employee.getId());	
	// if(employee != null) {
		// 	System.out.println("Employee found: " + employee.getName());
		// } else {
		// 	System.out.println("Employee not found");
		// }
	}

	@AfterEach
	public void afterEach(){
		System.out.println("after methode funktioniert");
	}

}

//BeforreEach und AfterEach sind JUnit 5 Annotations, die Methoden markieren, die vor bzw. nach jedem Testfall ausgeführt werden sollen.

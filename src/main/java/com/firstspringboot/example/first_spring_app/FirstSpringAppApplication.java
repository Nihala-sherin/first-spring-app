package com.firstspringboot.example.first_spring_app;

import com.firstspringboot.example.first_spring_app.model.Address;
import com.firstspringboot.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello, this is our first SpringBoot Project!");


		//tight coupling
//		Employee emp1=new Employee();
//		emp1.id=101;
//		emp1.name="Jawad";
//		emp1.designation="Software engineer";
//		emp1.email="jtp@gmail.com";
//		Address adrs1=new Address();
//		adrs1.doorNo=999;
//		adrs1.streetName="London Street";
//		adrs1.city="UK";
//		emp1.address=adrs1;
		//adrs1.city="new city" //changing the address of employee is dependent on Address object
//		System.out.println(emp1);
//		System.out.println(adrs1);

		//loose coupling with setter injection
		Employee emp1=new Employee();
		emp1.setId(102);
		emp1.setName("Niha");
		emp1.setDesignation("SoftwareEngineer");
		emp1.setEmail("niha@gmail.com");
		Address adrs1=new Address();
		adrs1.setCity("TUK");
		adrs1.setDoorNo(108);
		adrs1.setStreetName("Havens street");
		emp1.setAddress(adrs1);
		emp1.getAddress().setDoorNo(105); //changing address now only depends on emp object
		System.out.println(emp1);
		System.out.println(adrs1);

		//loose coupling with constructor injection
		Address add3=new Address(504,"Third street","3rd city");
		Employee emp3=new Employee(3,"Sher","sherni@gmail.com","Designer",add3);
		emp3.getAddress().setStreetName("New Street"); //changing address only depends emp object
		System.out.println("employee 3:--"+emp3);
	}

}

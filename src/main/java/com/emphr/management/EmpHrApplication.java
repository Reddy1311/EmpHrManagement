package com.emphr.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.emphr.management.model.Employee;
import com.emphr.management.model.UserRole;
import com.emphr.management.service.IRoleService;

@SpringBootApplication
public class EmpHrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpHrApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner (IRoleService service) {
		return args -> {
			UserRole r1 = new UserRole();
			r1.setName("EMPLOYEE");
			UserRole r2 = new UserRole();
			r2.setName("HR");
			service.saveRole(r1);
			service.saveRole(r2);
		};
	}

}

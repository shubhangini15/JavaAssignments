package com.lambda.comparision;

import java.util.ArrayList;
import java.util.List;

public class SortEmployee {

		public static List<Employee> getEmployees() {
			List<Employee> employees = new ArrayList<>();
			employees.add(new Employee(1, "Lokesh", 32));
			employees.add(new Employee(2, "Aman", 28));
			employees.add(new Employee(3, "Aakash", 52));
			employees.add(new Employee(4, "James", 72));
			employees.add(new Employee(5, "David", 19));
			employees.add(new Employee(6, "Lokesh", 25));
			employees.add(new Employee(7, "Karan", 59));
			

			return employees;
		}

	}
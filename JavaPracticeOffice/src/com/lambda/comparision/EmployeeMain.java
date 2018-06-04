package com.lambda.comparision;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
			try {
			List<Employee> employees  = SortEmployee.getEmployees();
			
			System.out.println("****Using Lambda Comparison, sort employee name*****");
			//Sort all employees by first name
			employees.sort(Comparator.comparing(e -> e.getFirstName()));

			/*OR you can use below
			  employees.sort(Comparator.comparing(Employee::getFirstName))*/

			/*print the sorted list*/
			System.out.println(employees);

			System.out.println("***Using for in/each loop*****");
			for(Employee e: employees) {
				System.out.println(e);
			}
			
			System.out.println("****Using lambda for each****");
			employees.forEach(e->System.out.println(e));

			System.out.println("******Using filter******");
			List<Employee> result = employees.stream() //convert list to stream
					.filter(e ->!"Lokesh".equals(e.getFirstName()))   //filter "Lokesh" only
					.collect(Collectors.toList());     //collect the output and convert streams to a List

			result.forEach(System.out::println); //Output: everything except Lokesh

			
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}



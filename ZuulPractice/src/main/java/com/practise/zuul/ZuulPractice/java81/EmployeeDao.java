package com.practise.zuul.ZuulPractice.java81;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDao {

	public static List<Employee> databaseList() {

		List<Employee> l1 = List.of(new Employee("Anand", "Cse", 7011, 1900095),
				new Employee("Manikant", "It", 99344, 1896015), new Employee("Shashwat", "Biotech", 99344, 1896021),
				new Employee("Rishabh", "It", 99344, 1896016), new Employee("Manikant", "Mech", 91999, 1896017),
				new Employee("Manikant", "Civil", 85400, 1896018), new Employee("Manikant", "ECE", 91999, 1896019));

		return l1;
	}

	public Map<Employee, Integer> databaseMap() {

		Map<Employee, Integer> mp = new HashMap<Employee, Integer>();

		mp.put(new Employee("Anand", "Cse", 7011, 1900095), 1);
		mp.put(new Employee("Manikant", "It", 99344, 1896015), 1);
		mp.put(new Employee("Shashwat", "Biotech", 99344, 1896015), 1);
		mp.put(new Employee("Rishabh", "It", 99344, 1896016), 1);
		mp.put(new Employee("Manikant", "Mech", 91999, 1896017), 1);
		mp.put(new Employee("Manikant", "Civil", 85400, 1896018), 1);
		mp.put(new Employee("Manikant", "Ece", 91999, 1896019), 1);

		return mp;
	}

}

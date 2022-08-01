package com.practise.zuul.ZuulPractice.java81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeService {

	public void show() {

	}

	public static void main(String[] args) {
		// List<Employee> l1 = EmployeeDao.databaseList();
		List<Integer> lst = Arrays.asList(5, 14, 3, 2, 8, 0);

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Apple", 1);
		mp.put("Orange", 2);
		mp.put("Pomegranate", 3);
		mp.put("Mango", 4);

		mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> e.getKey());

		// lst.stream().sorted().forEach(e->System.out.println(e));

		List<Employee> l2 = EmployeeDao.databaseList().stream()
				.sorted((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName())).collect(Collectors.toList());
		// .forEach(action -> System.out.println(action));
		/*
		 * for(Employee e:l2) { System.out.println(e); }
		 */
	}

}

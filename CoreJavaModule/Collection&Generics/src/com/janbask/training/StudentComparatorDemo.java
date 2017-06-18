package com.janbask.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorDemo {

	public static void main(String[] args) {

		List<Student> studList = new ArrayList<>();
		studList.add(new Student("Avinash", 45, 30));
		studList.add(new Student("Ravi", 65, 28));
		studList.add(new Student("Amit", 85, 26));
		studList.add(new Student("Gopal", 100, 29));
		
		System.out.println("Unstorted Student");
		studList.forEach(f -> {
			System.out.println(f);
		});
		
		Collections.sort(studList, new NameComparator());
		System.out.println();
		System.out.println("Storted Student on basis of Name");
		studList.forEach(f -> {
			System.out.println(f);
		});
	
		
		Collections.sort(studList, new AgeCompator());
		System.out.println();
		System.out.println("Storted Student on basis of Age");
		studList.forEach(f -> {
			System.out.println(f);
		});
		
	}

}

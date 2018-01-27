package org.test.ds.progs;

import java.util.Arrays;

public class MainEmpComparator {
public static void main(String[] args) {
	//sorting object array
	EmployeeComparator[] empArr = new EmployeeComparator[4];
	empArr[0] = new EmployeeComparator(10, "Mikey", 25, 10000);
	empArr[1] = new EmployeeComparator(20, "Arun", 29, 20000);
	empArr[2] = new EmployeeComparator(5, "Lisa", 35, 5000);
	empArr[3] = new EmployeeComparator(1, "Pankaj", 32, 50000);

	//sorting employees array using Comparable interface implementation
	Arrays.sort(empArr);
	System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
}
}
package AssignmentNo02;

import java.util.Arrays;
import java.util.Scanner;

class Employee {
	int empid;
	String name;
	double salary;

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void SelectionSort(Employee arr[], int N) {
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[j].getSalary() < arr[i].getSalary()) {
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}

public class A2_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1001, "e1", 5500.0);
		Employee e2 = new Employee(1002, "e2", 5000.0);
		Employee e3 = new Employee(1003, "e3", 6500.0);
		Employee e4 = new Employee(1004, "e4", 4000.0);
		Employee employees[] = { e1, e2, e3, e4 };
		System.out.println("Array before sort : " + Arrays.toString(employees));
		Employee.SelectionSort(employees, employees.length);
		System.out.println("Array after sort : " + Arrays.toString(employees)+"\n");
	}

}

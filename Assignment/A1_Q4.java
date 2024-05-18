package Assignment;
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

}

public class A1_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1001, "e1", 5500.0);
		Employee e2 = new Employee(1002, "e2", 6000.0);
		Employee e3 = new Employee(1003, "e3", 6500.0);
		Employee e4 = new Employee(1004, "e4", 7000.0);
		Employee employees[] = { e1, e2, e3, e4 };
		System.out.println("enter emp empid for search");
		int id = sc.nextInt();
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpid() == id) {
				System.out.println(employees[i]);
			}

		}
		System.out.println("enter emp salary for search");
		double salary = sc.nextDouble();
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() == salary) {
				System.out.println(employees[i]);
			}
		}
		System.out.println("enter emp name for search");
		String name=sc.next();
		for (int i = 0; i < employees.length; i++) {
			if (name.contains(employees[i].getName())){
				System.out.println(employees[i]);
			}
		}

	}

}

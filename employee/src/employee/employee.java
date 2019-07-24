package employee;

public class employee {
	int age;
	double salary;
	int empId;
	double varpay;
	double variblepay;
	int dafpercentage = 9;
	static int noOfEmp=0;
	public static void printCount() {
		System.out.println(noOfEmp);
		noOfEmp++;
	}

	public void calculateVariblePay() {
		variblepay = (salary * dafpercentage) / 100;
	}

	public void calculateVariblePay(double ratingpercentage) {
		variblepay = (salary * ratingpercentage) / 100;
	}

	employee(int empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getVarpay() {
		return varpay;
	}

	public void setVarpay(double varpay) {
		this.varpay = varpay;
	}

	employee() {
		this.empId = 0000;
	}
}
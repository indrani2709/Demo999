package employee;

public class mainclass {
	public static void main(String[] args) {
		employee e=new employee();
		System.out.println(e.getEmpId());
employee e1=new employee(98765);
System.out.println(e1.getEmpId());
Manger manger=new Manger(243,564.5,78);
System.out.println(manger.getBouns());
System.out.print(manger.getEmpId());
System.out.println(manger.getNoOfReportees());


	}
}

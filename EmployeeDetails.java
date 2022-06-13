package week1.day2;

public class EmployeeDetails {

	public void printEmployeeName(String empName,int empid)
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empid);
	}
	public void getEmployeeAdd(String empAddress)
	{
		System.out.println("Employee Address: "+empAddress);
	}
	public void getEmployeeSalary(double empSalary)
	{
		System.out.println("Employee Salary: "+empSalary);
	}
	public void getEmployeeMobileNumber(long mobNum)
	{
		System.out.println("Employee Mobile: "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Rajeswari",1001);
		emp.getEmployeeAdd("Chennai");
		emp.getEmployeeSalary(160000.45);
		emp.getEmployeeMobileNumber(987987987);
		

	}

}

package Employee;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		Employee1 obj=new Employee1();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the emid");
		int emid =in.nextInt();
		
		System.out.println("Enter empname");
		String empname=in.next();
		System.out.println("enter the empsalary");
		double salary=in.nextDouble();
		
		obj.setEmpid(emid);
		obj.setEmpname(empname);
		obj.setSalary(salary);
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpname());
		System.out.println(obj.getSalary());
		in.close();
	
		EmployeeService bonusamt = new EmployeeService();
		System.out.println("Eployee bonus amount:="+bonusamt.calculateBonus(obj));

		
	}
}

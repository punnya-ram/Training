package Employee;

public class EmployeeService {

	public double calculateBonus(Employee1 object) {
		double salary = object.getSalary();
		double bonus = salary*0.33;
		return bonus;
	}
}

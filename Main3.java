package youtube2;

public class Main3 {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.email="aaabbbccc@dnfls";
		Employee employee =new Employee();
		employee.salary=123444;
		
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
		
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.bestEmployee();

	}

}

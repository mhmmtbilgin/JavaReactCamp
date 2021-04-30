package inheritance3;

public class Main {

	public static void main(String[] args) {
		//Customer customer = new Customer();
		//Employee employee = new Employee();

		
		EmployeeManager employeeManager= new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.list();
		
		System.out.println("_______________________________");
		employeeManager.BestEmployee();
		employeeManager.add();
		employeeManager.list();

	}

}


//Muhammet Bilgin...@mhmmtbilgin

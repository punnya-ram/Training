package Customer1;

public class Application {

	public static void main(String[] args) {
		Customer Obj = new Customer("Ram",77,999444999);
		System.out.println("Customer name="+Obj.getcustomerName());
		System.out.println("Customer id="+Obj.getcustomerId());
		System.out.println("Customer phone number="+Obj.getcustomerPhoneno());
	}

}


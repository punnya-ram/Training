package Customer1;

public class Customer {

	private String customerName;
	private int customerId;
	private long customerPhoneno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String customerName, int customerId, long customerPhoneno) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhoneno = customerPhoneno;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		customerName = customerName;
	}
	public int getcustomerId() {
		return customerId;
	}
	public void setcustomerId(int customerId) {
		customerId = customerId;
	}
	public long getcustomerPhoneno() {
		return customerPhoneno;
	}
	public void setcustomerPhoneno(long customerPhoneno) {
		customerPhoneno = customerPhoneno;
	}

	}



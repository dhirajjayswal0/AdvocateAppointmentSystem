package advocateappointment.entity;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContactNumber;
	private String customerEmailId;
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCcustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public Customer(int customerId,String customerName, String customerContactNumber, String customerEmailId,String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerContactNumber = customerContactNumber;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.customerAddress= customerAddress;
	}
	public Customer(String customerName, String customerContactNumber, String customerEmailId,String customerAddress) {
		super();
		//this.c_Id = c_Id;
		this.customerContactNumber = customerContactNumber;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.customerAddress= customerAddress;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String c_Address) {
		this.customerAddress = c_Address;
	}
	@Override
	public String toString() {
		return "Id=" + customerId + ",  Name=" + customerName + ", ContactNumber=" + customerContactNumber + ", EmailId="
				+ customerEmailId + ", Address=" + customerAddress + "\n";
	}  
	
		
	
	
}

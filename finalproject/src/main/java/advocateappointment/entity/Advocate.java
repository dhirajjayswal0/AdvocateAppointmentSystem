package advocateappointment.entity;

public class Advocate {
	private int advocateId;
	private String advocateContactNumber;
	private String advocateName;
	private String advocateAddress;
	public Advocate(int advocateId, String advocateName, String advocateContactNumber, String advocateAddress) {
		super();
		this.advocateId = advocateId;
		this.advocateContactNumber = advocateContactNumber;
		this.advocateName = advocateName;
		this.advocateAddress = advocateAddress;
	}
	public int getAdvocateId() {
		return advocateId;
	}
	public void setAdvocateId(int advocateId) {
		this.advocateId = advocateId;
	}
	public String getAdvocateContactNumber() {
		return advocateContactNumber;
	}
	public void setAdvocateContactNumber(String advocateContactNumber) {
		this.advocateContactNumber = advocateContactNumber;
	}
	public String getAdvocateName() {
		return advocateName;
	}
	public void setAdvocateName(String advocateName) {
		this.advocateName = advocateName;
	}
	public String getAdvocateAddress() {
		return advocateAddress;
	}
	public void setAdvocateAddress(String advocateAddress) {
		this.advocateAddress = advocateAddress;
	}
	@Override
	public String toString() {
		return " Id=" + advocateId + ", ContactNumber=" + advocateContactNumber + ", Name=" + advocateName + ", Address="
				+ advocateAddress +"\n";
	}
	
	
	
}

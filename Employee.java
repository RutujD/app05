//問題5
package app05.com.test;


public class Employee {

	
		// TODO Auto-generated constructor stub
		private String employeeId;
	    private Person person;
	    private Address address;
	    private String phoneNumber;
	    private String emailAddress;
	    
	    // コンストラクタ
	    public Employee(String employeeId, Person person, Address address, String phoneNumber, String emailAddress) {
	        this.employeeId = employeeId;
	        this.person = person;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.emailAddress = emailAddress;
	    
	}

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

}

package java111.week7;
public class ResidentPhone {
	//add private fields: last_name, first_name, phone_number
	private String last_name;
	private String first_name;
	private String phone_number;
		
    
    //default constructor

    //constructor with three parameters
	ResidentPhone(String first_name, String last_name, String phone_number){
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
	}
	 
	


	 //public method: getFirstName
	public String getFirst_name() {
		return first_name;
	} 
	 //public method: setFirstName
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	} 
	//public method: getLastName
public String getLast_name() {
	return last_name;
}	
	 //public method: setLastName
public void setLast_name(String last_name) {
	this.last_name = last_name;
}	 
	 //public method: getPhoneNumber
	public String getPhone_number() {
		return phone_number;
	}	
	 //public method: setPhoneNumber
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	} 
	 
	 //public method: toString 
	@Override
	public String toString() {
		return last_name + " " + first_name + " " + phone_number;
	}
}

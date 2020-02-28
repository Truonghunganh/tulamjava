package luyentap76nhanvien;
// employee : nhân viên
// social security number : số an sinh xã hội
// pay rate : tỷ lệ chi trả/ bậc lương
@SuppressWarnings("serial")
public  class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	

	@Override
	public String toString() {
		return super.toString() +"số an sinh XH : "+ socialSecurityNumber + " ; Bậc lương : " + payRate + " ; ";
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public double getPayRate() {
		return payRate;
	}


	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
    


	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 1.5*payRate;
	}
	@Override
	public int maphanloai() {
		return 3;
	}
    
}

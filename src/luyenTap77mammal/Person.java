package luyenTap77mammal;

import java.util.Date;
//mammal : động vật có vú
public abstract class Person implements Mammal {
    private String firstname;
    private BloodGroup bloodGroup;
    private Address homeaddress;
    
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	@Override
	public String toString() {
		return "tên : " + firstname + ", nhóm máu " + bloodGroup.getBloodGroup() + ", địa chỉ nhà : " + homeaddress.getPostcode() + " , ";
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAgeAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}

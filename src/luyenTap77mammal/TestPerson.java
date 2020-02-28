package luyenTap77mammal;

import java.security.Permissions;
import java.util.ArrayList;

public class TestPerson {
    static ArrayList<Person>persons=new ArrayList<>();
    
	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}
	public  void addPerson(Person person) {
		persons.add(person);
	}
    public static void xuat() {
		for (Person p: persons) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
	     
         Woman thuy=new Woman();
         thuy.setFirstname("đổ minh thúy");
         Address addres=new Address();
		 addres.setPostcode("đà nẵng");
		 thuy.setHomeaddress(addres);
		 BloodGroup bGrou=new BloodGroup();
		 bGrou.setBloodGroup("A");
		 thuy.setBloodGroup(bGrou);
         thuy.setWearingMakeup(true);
         persons.add(thuy);
    
	 Man anh=new Man();
		 
		 anh.setFirstname("trương hùng anh");
		 Address address=new Address();
		 address.setPostcode("điện phươc");
		 anh.setHomeaddress(address);
		 BloodGroup bGroup=new BloodGroup();
		 bGroup.setBloodGroup("AB");
		 anh.setBloodGroup(bGroup);
         anh.setWatchingFootball(true);
         persons.add(anh);
    
         for(Person P: persons)
         {
        	 if (P instanceof Man) {
				System.out.println("nam");
			} else {
				System.out.println("nữ");

			}
            System.out.println(P);   
         }
     //    xuat();
	}

}

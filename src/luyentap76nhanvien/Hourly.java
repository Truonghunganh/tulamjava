package luyentap76nhanvien;
//hourly employee : nhân viên làm theo giờ
//add hour : làm thêm giờ
//hours worked : giờ làm 
//more Hour : thêm giờ 
@SuppressWarnings("serial")
public class Hourly extends Employee {
     private int addHour;
     
     public int getAddHour() {
		return addHour;
	}
	public void setAddHour(int addHour) {
		this.addHour = addHour;
	}
	public void addHours(int moreHours) {
		this.addHour=moreHours;
		System.out.println("adđ hours : "+this.addHour);
	}
     @Override
    public double pay() {
    	return addHour*0.05;
    }
    @Override
    public String toString() {
    	return "nhân viên làm theo giờ : "+ super.toString()+" ; tiền lương : "+pay()+" triệu đồng ";
    } 
    @Override
	public int maphanloai() {
		return 5;
	}
    
}

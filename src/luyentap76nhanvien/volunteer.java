package luyentap76nhanvien;
// volunteer : tình nguyện
@SuppressWarnings("serial")
public class volunteer extends StaffMember {

	private double money;
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		
		return "nhân viên tinh nguyên : "+ super.toString()+" ; tiền lương : "+pay() +" triều đồng";
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return this.getMoney();
	}
	@Override
	public int maphanloai() {
		return 2;
	}
    
}

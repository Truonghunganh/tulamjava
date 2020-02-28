package luyentap76nhanvien;
//executive : điều Hành 
//bonus : tiền thưởng
// award bonus : phần thưởng
//exec bonus : tiền thưởng thực hiện 
@SuppressWarnings("serial")
public class Executive extends Employee {
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void awardBonus(double execBonus) {
		this.bonus=execBonus;
		System.out.println(" award Bonus = "+this.bonus);
	}

	@Override
	public String toString() {
		return "nhân viên điêu hành : "+ super.toString()+"tiền thưởng : "+bonus+" ; tiền lương : "+pay()+" triệu đồng";
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+bonus;
	}
	@Override
	public int maphanloai() {
		return 4;
	}
    
}

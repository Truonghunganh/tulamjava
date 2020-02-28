package tamgiac;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	public TamGiac(double canhA, double canhB, double canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	public double getCanhA() {
		return canhA;
	}
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	public double getCanhB() {
		return canhB;
	}
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	public double getCanhC() {
		return canhC;
	}
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}
	@Override
	public String toString() {
		String s ="cạnh A= "+this.canhA+"; canh B= "+this.canhB+"; cạnh C= "+this.canhC;
		if (kiemtraTGhople()) {
			return s=s+"\n chu vi : "+chuvi()+"\n diện tich : "+dientich();
		}
		else {
			return s=s+"\n đây là tam giác không hợp lệ :)";
		}
	}
	private boolean kiemtraTGhople(){
		boolean kt=this.canhA>0&&this.canhC>0&&this.canhB>0&&this.canhA+this.canhB>this.canhC&&this.canhA+this.canhC>this.canhB&&this.canhB+this.canhC>this.canhA;
		return kt;
	}
	private double chuvi() {
		return this.canhA+this.canhB+this.canhC;
	}
	private double dientich() {
		double p=chuvi()/2;
		return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
		
	}
}

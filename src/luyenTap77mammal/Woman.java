package luyenTap77mammal;

public class Woman extends Person {
	private boolean wearingMakeup;

	public boolean isWearingMakeup() {
		return wearingMakeup;
	}

	public void setWearingMakeup(boolean wearingMakeup) {
		this.wearingMakeup = wearingMakeup;
	}

	@Override
	public String toString() {
		return super.toString()+"Woman [wearingMakeup=" + wearingMakeup + "]";
	}
	

     
}

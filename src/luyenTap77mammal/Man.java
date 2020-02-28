package luyenTap77mammal;

public class Man extends Person {
	private boolean watchingFootball;

	public boolean isWatchingFootball() {
		return watchingFootball;
	}

	public void setWatchingFootball(boolean watchingFootball) {
		this.watchingFootball = watchingFootball;

	}

	@Override
	public String toString() {
		return super.toString()+"Man [watchingFootball=" + watchingFootball + "]";
	}
}
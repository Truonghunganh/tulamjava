package hocdatientrinh;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+":I="+i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

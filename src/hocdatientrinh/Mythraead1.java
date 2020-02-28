package hocdatientrinh;

public class Mythraead1 implements Runnable{

	@Override
	public void run() {
	
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+",i="+1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

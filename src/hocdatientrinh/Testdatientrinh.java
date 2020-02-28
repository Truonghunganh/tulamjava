package hocdatientrinh;

public class Testdatientrinh {
//https://www.facebook.com/gv.nguyenthanhtung/videos/429856627765813/
	public static void main(String[] args) {
		String a="hun";
		String b="hung";
		if (a==b) {
			System.out.println("đúng");
		} else {
			System.out.println("sai");

		}
		Thread th1=new Thread(new Mythraead1());
		th1.setName("tiến trình 1");
		Thread th2=new Thread(new Mythraead1());
		th2.setName("tiến trình 2");
		Thread th3=new Thread(new Mythraead1());
		th3.setName("tiến trình 3");
		th1.start();
		th2.start();
		th3.start();
		
//		MyThread myThread1=new MyThread();
//        myThread1.start();
//        MyThread myThread2=new MyThread();
//        myThread2.start();
//        MyThread myThread3=new MyThread();
//        myThread3.start();
	
	}

}

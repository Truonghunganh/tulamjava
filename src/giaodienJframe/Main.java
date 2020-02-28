package giaodienJframe;

import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		while (true) {
			menu();			
		}

		
	}

	@SuppressWarnings("resource")
	private static void menu() {
		int lc = -1;
		System.out.println("0. kết thúc chương trình");
		System.out.println("1. giao diện mờ đầu ");
		System.out.println("2. giao diện Flowlayout");
		System.out.println("3. giao diện Boxlayout (sếp toàn màn hình ) theo hàng dọc");
		System.out.println("4. giao diện Boxlayout (sếp toàn màn hình ) theo hàng ngang");
		System.out.println("5. giao diện borderlayout");
		System.out.println("6. giao diệu giải phương trình bậc nhất");
		System.out.println("7. giao diện của border và JTextArea");
		System.out.println("8. giao diện của border và JTextArea , Jchecbox , jRadiaButton");
		System.out.println("9.  giao diện có Jcombobox và Jlist");
			System.out.print("mời bạn nhập lựa chọn : ");
		try {
			  lc = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("bạn nhập sai rồi");
		}
		switch (lc) {
		case 0:
			System.out.println("cảm ơn bạn đã sử dụng phần mềm ");
			System.exit(0);
			break;
		case 1:
			@SuppressWarnings("unused") Giaodien giaodien=new Giaodien("giao diện của hùng anh");
			break;	
		case 2:
			flowlayout();
			break;
		case 3:
			boxlayoutdoc();
			break;
		case 4:
			boxlayoutngang();
			break;
		case 5:
			borderLayout();
			break;
		case 6:
			giaiPTB1();
			break;
		case 7:
			borderjtextarea();
			break;
		case 8:
			borderjtextareachecboxradia();
			break;
		case 9:
			JcomboboxJlist();
			break;
		default:
			break;
		}
	}

	private static void JcomboboxJlist() {
		HoocJcomboboxJList hoocJcomboboxJList=new HoocJcomboboxJList("học jcombobox và JList");
		hoocJcomboboxJList.showWindow();
	}

	private static void borderjtextareachecboxradia() {
		HocbordervaJTextAreaChecboxRadia hocbordervaJTextAreaChecboxRadia=new  HocbordervaJTextAreaChecboxRadia("học học học ...");
		hocbordervaJTextAreaChecboxRadia.showWindow();
	
	}

	private static void borderjtextarea() {
		HocbordervaJTextArea hocbordervaJTextArea=new HocbordervaJTextArea("học border và JtextArea");
		hocbordervaJTextArea.showWindow();
	}

	private static void giaiPTB1() {
		GiaiPT1 giaiPT1=new GiaiPT1("giải phương trình bật 1");
	    giaiPT1.showWindow();
	}

	private static void borderLayout() {
		HocBorderlayout hocBorderlayout=new HocBorderlayout("học borderlayout");
		hocBorderlayout.addContainer();
		hocBorderlayout.showWindow();
	}

	private static void boxlayoutngang() {
		HocBoxlayout hocBoxlayout=new HocBoxlayout("boxlayout theo hàng ngang");
		hocBoxlayout.containeltheohangngang();
		hocBoxlayout.showWiindow();
	}

	private static void boxlayoutdoc() {
		HocBoxlayout  hocBoxlayout=new HocBoxlayout("boxlayout theo hàng dọc");
		hocBoxlayout.containeltheohangdoc();
		hocBoxlayout.showWiindow();
		
		
	}

	private static void flowlayout() {
		//các button tự động sẽ tự động xuống dòng nếu  giao diện khi hết chổ 
		HocFlowLayout hocFlowLayout=new HocFlowLayout("flowlayout");
		hocFlowLayout.showWindow();
				
	}
}

package oppquanglysinhven;

public enum XepLoai {
       gioi("giỏi"),
       kha("khá"),
       trungbinh("trung bình"),
       yeu("yếu");
       private String string;
    XepLoai(String string) {
	   this.string=string; 
	}
    public String description() {
		return this.string;
	}
}

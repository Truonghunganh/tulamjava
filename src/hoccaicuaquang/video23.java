package hoccaicuaquang;

public class video23 {
	public static void hinhc(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hinhd(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0||i==n-1||i==j) {
					System.out.print("*");
				} else {
                    System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void hinhe(int n) {
		for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
				System.out.print("*");
			} 			
		}
		System.out.println();
	}
	public static void hinhf(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0||j==0||i+j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void hinhg(int n) {
		for (int i = 0; i < n-1; i++) {
			for (int j = n-1; j >= 0; j--) {
				if (i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");   
				}
			}
			System.out.println();
		}
	}
	public static void hinhh(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j==n-1||i==n-1||j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void hinhi(int n) {
		int k=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hinhj(int n) {
		int k=n+1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < 2*n-1; j++) {
				
				if (i==n-1||i+j==n-1|| i+j==2*n-k) {
					System.out.print("*");
				} else {
					System.out.print(" ");  
				}
			}
			k=k-2;
			System.out.println();
		}
	}
	public static void hinhk(int n) {
		int k=0;
		for (int i = 0; i < 2*n-1; i++) {
			for (int j = 0; j < n; j++) {
				k=i-j;
				if (0<=k&&k<n) {
					System.out.print("*");
				} else {
					System.out.print(" ");  
				}
			}
			System.out.println();
		}
	}
	public static void hinhl(int n) {
		int k=0;
		for (int i = 0; i < 2*n-1; i++) {
			for (int j = 0; j < n; j++) {
				k=i-j;
				if ((i-j==0||i-j==n-1||(k>0&&k<n-1&&j==0)||(k>0&&k<n-1&&j==n-1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");  
				}
			}
			System.out.println();
		}
	}
	public static void hinhm(int n) {
		int k=0;
		for (int i = 0; i < 2*n-1; i++) {
			for (int j = 0; j < 2*n-1; j++) {
				k=i-j;
				if ((k>=0&&k<n&&i<n)||(i>n-2&&k<=0&&k>-n)) {
					System.out.print("*");
				} else {
					System.out.print(" ");  
				}
			}
			System.out.println();
		}
	}
	public static void hinhn(int n) {
	
		for (int i = 0; i < 2*n-1; i++) {
			for (int j = 0; j < 2*n-1; j++) {
				if ((i-j==0||i==n-1||(i<n&&j==0)||(i>n-2&&j==2*n-2))) {
					System.out.print("*");
				} else {
					System.out.print(" ");  
				}
			}
			System.out.println();
		}
	}
	
	public static void hinha(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hinhb(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
			{
		         if (i==0||i==n-1||j==0||j==n-1)
		         {
					System.out.print("*");
				}
		         else
		         {
                    System.out.print(" "); 
				} 
			}
			System.out.println();
		}
	}
	public static boolean ktcacchusohoantoanchan(int n) {
		while (n!=0) {
			if ((n%10)%2==1) {
				return false;
			}
			n=n/10;
		}
		return true;
	}
	// S=x+x^3/3!+......+a^(2n-1)/(2n-1)!
	public static double tinhS(int x,int n) {
		double S=0;
		for (int i = 1 ;i < n+1; i++) {
			S=S+Math.pow(x, 2*i-1)/giaithua(2*i-1);
		}
		return S;
	}
	public static double giaithua(int n) {
		if (n==0) {
			return 1;
		}
		double giaithua=1;
		for (int i = 1; i < n+1; i++) {
			giaithua=giaithua*i;
		}
		return giaithua;
	}
	public static boolean sohoanthien(int a) {
		int S=1;
		for (int i = 2; i < a/2+1; i++) {
			if (a%i==0) {
				S=S+i;
			}
		}
		if (S==a) {
			return true;
		}
		return false;
	}

	public static int UCLN(int a,int b) {
		int UCLN=0;
		if (a<b) {
			UCLN=a;a=b;b=a;
		}
		for (int i = a/2; i >0; i--) {
			if (a%i==0&&b%i==0) {
				UCLN=i;
				break;
			}
		}
		return UCLN;
	}
	public static void main(String[] args) {
		if (ktcacchusohoantoanchan(82686)) {
			hinhn(6);
			System.out.println(UCLN(48, 36));
		}
		else {
			System.out.println(tinhS(2, 3));
		}

	}

}

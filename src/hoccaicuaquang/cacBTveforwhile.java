package hoccaicuaquang;

public class cacBTveforwhile {

	public static void tamgiacvuongloai4(int n) {
		int k=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n-k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			k++; 
		}
	}
	public static void tamgiacvuongloai3(int n) {
		int k=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			k++; 
		}
	}
	public static void tamgiacvuongloai1(int n) {
		int k=n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			k--;
		}
	}
	public static void tamgiacvuongloai2(int n) {
		int k=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			k++;
		}
	}
	public static void haihinhtamgiac(int n) {
		int k = 0,h=0,vitri=0;
		if(n%2==0) {k=n-1;}
		else {
			k=n;
		}
		vitri=k-1;
		h=k;
		for (int i = 1; i < k+1; i++) {
			if (i>k/2) {
				System.out.print("*");
			} else {
                System.out.print(" "); 
			}
		}
		System.out.print("\n");
		h=k-2;
		for (int i = 1; i<h+1; i++)
		{
		    for (int j = 1; j < k+1; j++)
		    {
				if (j==k/2+1||j==vitri) 
				{
					System.out.print("*");
				}
				else 
				{
                    System.out.print(" ");   
				}
		    }
		    vitri--;
		    System.out.print("\n");
		}
		for (int i = 0; i < k+1; i++) {
			if (i<=k/2) {
				System.out.print("*");
			} else {
                System.out.print(" "); 
			}
		}
	}
	public static void haihinhtamgiactheocach2(int n) {
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j <n; j++) {
				if (i+j==n-1||j==n/2||(i==0&&j>=n/2)||(j<=n/2&&i==n-1)) {
			         System.out.print("*");		
				} else {
                     System.out.print(" "); 
				}
			}    
		    System.out.println();
		}
	}
	//S=x+x^2/(1+2)+.........+x^n/(1+...+n)
	public static double  bieuthuctren(int n,int x) {
		double S=0;
		double k=0;
		for (int i = 1; i < n+1; i++) {
			k=k+i;
		S=S+Math.pow(x, i)/(k);
		}
		return S;
	}
	public static void main(String[] args) {
		System.out.println("s="+bieuthuctren(3, 2));
        haihinhtamgiactheocach2(12);
	}

}

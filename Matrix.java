import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int n,m;	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of rows for the squared matrix: ");
		n=s.nextInt();
		m=n;
		
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
			
			}
		}
		System.out.println();
		
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
			System.out.print(arr[i][j]+"\t");
		}
				System.out.println();
			}	
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println();
			int rows=n;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<rows;j++) {
					if(j>=i) {
						System.out.print(arr[i][j]+"\t");
					}
					else 
						System.out.print(" \t");
				}
				System.out.println();
			}
			System.out.println();
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
			System.out.print(arr[j][i]+"\t");
		}
				System.out.println();
			}	
			
	}

}

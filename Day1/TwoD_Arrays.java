package Day1;
import java.util.Scanner;
public class TwoD_Arrays {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] arr=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		in.close();

	}

}

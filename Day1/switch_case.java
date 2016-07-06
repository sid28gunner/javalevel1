package Day1;
import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		System.out.println("************VIBGYOR Explained*************");
        Scanner in=new Scanner(System.in);
        String c=in.next();
        in.close();
        
        switch(c)
        {
        case "V":System.out.println("Violet");break;
        case "I":System.out.println("Indigo");break;
        case "B":System.out.println("Blue");break;
        case "G":System.out.println("Green");break;
        case "Y":System.out.println("Yellow");break;
        case "O":System.out.println("Orange");break;
        case "R":System.out.println("Red");break;
        default:System.out.println("You must have entered a wrong number");break;
        }
	}

}

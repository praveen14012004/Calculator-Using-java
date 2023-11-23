import java.util.*;
/**
 * calculate
 */
public class calculate {

    public static void main(String[] args) {
        int n1, n2 , ch, cal ;
        System.out.println(" Enter The Numbers");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println(" Enter The Operations");
        System.out.println(" Press 1 For Addition");
        System.out.println(" Press 2 For Substarction");
        System.out.println(" Press 3 For Multiplication");
        System.out.println(" Enter 4 For Division");
        ch = sc.nextInt();
        if (ch==1) {
            cal=n1+n2;
            System.out.println("The Sum of " + n1+ " and " + n2 +" = "+ cal);

        }
        else if (ch==2) {
            cal= n1-n2;
            System.out.println("The Subtract of" + n1+ "and" + n2 +"="+ cal);

        }
        else if (ch==3) {
        cal=n1*n2;
        System.out.println("The Multiply of" + n1+ "and" + n2 +"="+ cal);

        }
        else if (ch==4) {
        cal= n1%n2;
        System.out.println("The Division of" + n1 + "and" + n2 + "=" + cal);


        }
        else{
            System.out.println("Please choose correct Method");

        }

        
    }
}
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter your text:");
        String text=in.next();

        System.out.println("Enter printer type:");
        String type=in.next();


        if (type == "char" ){
            System.out.println("Printing...");
            for (char ch: text.toCharArray())
            {
                System.out.println(ch);
            }
        }else if (type =="buffer" ){
            System.out.println("Printing...");
            int i=0;
            for (char ch: text.toCharArray())
            {
                System.out.print(ch);
                i++;
                if(i%3==0)
                    System.out.println();
            }

        }else System.out.println("enter valid preinter type");


    }
}
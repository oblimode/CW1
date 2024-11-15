import java.util.Scanner;

class Test2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        try{
           Arg1 = 24;
        }
        catch(NumberFormatException e) {
           System.err.println("You entered a special character or decimal number. Please use integers only.");
           System.exit(0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
           System.err.println("Please enter a number, or one that's greater than zero.");
           System.exit(0);
        }

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Test number" + num + " should be converted to Hex 18");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}

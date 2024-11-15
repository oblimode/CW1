import java.util.logging.Logger;

class Dec2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        Logger logger = Logger.getLogger(Dec2Hex.class.getName());
	try{ // Exception handler
           Arg1 = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e) { // Invalid letter used when starting program
           logger.severe("You entered a special character or decimal number. Please use integers only.");
           System.exit(1);
        }
        catch(ArrayIndexOutOfBoundsException e) { // No number entered
           logger.severe("Please enter a number, or one that's greater than zero.");
           System.exit(1);
        }

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // initialise
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        String convMessage = "Converting the Decimal Value " + num + " to Hex...";
        logger.info(convMessage); // Tell user conversion is starting

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

	// Show hex result
	String hexMessage = "Hexadecimal representation is: " + hexadecimal;
        logger.info(hexMessage);

    }
}

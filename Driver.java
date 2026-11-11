import java.lang.BufferedReader;
import java.io.*;

public class Driver
{
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		System.out.print("Select from the following menu:" +
                         "\t0.  Close the Shopping Center.\n" +
                         "\t1.  Customer enters Shopping Center.\n" +
                         "\t2.  Customer picks an item and places it in the shopping cart.\n" +
                         "\t3.  Customer removes an item from the shopping cart.\n" +
                         "\t4.  Customer is done shopping.\n" +
                         "\t5.  Customer checks out.\n" +
                         "\t6.  Print info about customers who are shopping.\n" +
                         "\t7.  Print info about customers in checkout lines.\n" +
                         "\t8.  Print info about items at or below re-stocking level.\n" +
                         "\t9.  Reorder an item.\nMake your menu selection now: ");


        int input = Integer.parseInt(stdin.readLine().trim());
        System.out.println(input);

        while(input != 0) {
            switch(input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
            }

            System.out.print("\nMake your menu selection now: ");
            input = Integer.parseInt(stdin.readLine().trim());
            System.out.println(input);
        }
        System.out.println("Exiting program...Good Bye");

	}
}
package mikaseeartea;
import java.util.Scanner;

/** Mein zweites Java-Programm
    @author     Mika Seeartea
    @version    1.0
    @see        java.util.Scanner
 */
public class Main
{
    public static void main(String[] args)
    {
        String myname;
        String mysurname;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please tell daddy your First Name:");
        myname = scanner.nextLine();
        System.out.print("Please tell daddy your Last Name:");
        mysurname = scanner.nextLine();
        System.out.print("Hi " + myname + " " + mysurname + ", you're looking real submissive and breedable today heheh ;)");
    }
}
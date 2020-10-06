package cse360assignment02;
import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
        AddingMachine machine = new AddingMachine();
        Scanner scan = new Scanner(System.in);
        String input = "";
        int num = 0;
        while(!input.equals("quit"))
        {
            System.out.println("Enter operation:");
            input = scan.nextLine();
            if(input.equals("add"))
            {
                System.out.println("Enter number to add: ");
                num = scan.nextInt();
                machine.add(num);
            }
            else if(input.equals("subtract"))
            {
                System.out.println("Enter number to subtract: ");
                num = scan.nextInt();
                machine.subtract(num);
            }
            else if(input.equals("clear"))
            {
                machine.clear();
            }
        }
        String endString = machine.toString();
        System.out.println(endString);
    }

}

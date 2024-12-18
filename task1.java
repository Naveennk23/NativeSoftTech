
/*Using addition subtraction multiplication division
 * Implement a console-based interface that prompts users for
 inputs. Ensure the calculator performs accurate calculations
 for basic operations. Include error handling for invalid inputs
 (e.g., non-numeric inputs). 
 */
package Task;
import java.util.*;
import java.util.Scanner;
interface Calculator{
	void Addition();
	void Subtrcation();
	void Multiplication();
	void Division();
}
class  Calculation implements Calculator{
	private Scanner sc;
    public  Calculation(Scanner sc) {
	        this.sc= sc;
	       // if(sc==null) return;
	    }		
	public void Addition() {
		System.out.println("enter the number to add");
		long a = sc.nextLong();
		System.out.println("enter the number to add");
		long b = sc.nextLong();
		long c = (a+b);
		System.out.println("the answer"+c);
	}
	public void Subtrcation(){
		System.out.println("enter the number to subtract");
		long x = sc.nextLong();
		System.out.println("enter the number to subtract");
		long y = sc.nextLong();
		if(x==0||y==0) {
			System.out.println("Zero is not subtractable");
		}
		else {
		long z = (x-y);
		System.out.println("the answer"+z);
		}
	}
	public void Multiplication() {
		System.out.println("enter the number to multiply");
		long a1 = sc.nextLong();
		System.out.println("enter the number to multiply");
		long b2 = sc.nextLong();
		if(a1==0 || b2==0) {
			System.out.println("Zero cannot be multiplied");
		}
		else {
		long c3 = (a1*b2);
		System.out.println("the answer"+c3);
		}
	}
	public void Division() {
		System.out.println("enter the number to division");
		long x1 = sc.nextLong();
		System.out.println("enter the number to division");
		long y2 = sc.nextLong();
		if(y2==0) {
			System.out.println("Division by zero is not allowed");
		}
		else {
		long z3 = (x1/y2);
		System.out.println("the answer"+z3);
		}
	}
}
	
public class task1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Calculation va = new Calculation(sc);
while(true) {
System.out.println("Select operation:1.Addition 2.Subtrcation 3.Multiplication 4.Division 5.Exit");
		int choice = sc.nextInt();
		sc.nextLine();
        switch (choice) {
            case 1:
                va.Addition();
                break;
            case 2:
                va.Subtrcation();
                break;
            case 3:
                va.Multiplication();
                break;
            case 4:
                va.Division();
                break;
            case 5:
                System.out.println("Exiting the calculator.");
                sc.close();
                return;
            default:
            System.out.println("Invalid choice. Please select a valid operation.");
        }
	}
	}
}




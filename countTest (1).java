import java.util.Scanner;
public class countTest {

	public static void main(String[] args) {
	    
		Scanner input1 = new Scanner(System.in);
System.out.println("Program developed by Jaylen Carroll");

Count c1=new Count(0,0);

//end of method
	
	do{
		c1.printMenu();
	
	}while(c1.proccessMenu());// needs to be true for the process to go again


	
}//end of class
}
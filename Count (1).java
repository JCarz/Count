import java.util.Scanner;
public class Count {
	
	
		private int startNum, stepSize;// private variables 
		Scanner input = new Scanner(System.in);
	
	
	public Count(int num, int size) {//parameterized constructor the int num and int size are arguments has variables inside the brackets 
		this.startNum=num;// the this variables can only be used inside a new object outside of the class i.e countTest
		this.stepSize=size;// can only be called in the outside class i.e countTest
}
	public void getValuesFromUser() {
		System.out.print("Enter the start value: ");
		startNum=input.nextInt();// this will be the starting number the user inputs and displays
		System.out.print("Enter the countdown step size: ");
		stepSize=input.nextInt();// this will be the incrementation the user inputs
		
		while(startNum<=0||stepSize<=0) {// if a user inputs a value less than zero as a starting number error will occur
		System.err.println("\nError: *** INVALID ENTRY ***");
		System.out.println("Enter the start value: ");
		startNum=input.nextInt();// user input for the start number
		System.out.println("Enter the countdown step size: ");
		stepSize=input.nextInt();// the users input for how much it will be deincremented 
		}
}

	public void printMenu(){
		System.out.println("\n1)Display Count");
		System.out.println("2)Exit");
		System.out.print("Enter your selection: ");
}// end of method, This method displays the menu the user will see from the start 
	
public  void displaySteps() {
	for(int e =startNum; e >=0; e-=stepSize){
		System.out.print(e+" ");
		
}// end of method int e is equal to start num 
	
}
public boolean proccessMenu() {
	int menuInput=input.nextInt() ;
	
	if (menuInput==1) {
		getValuesFromUser();
		displaySteps();
	return true;
	}else if (menuInput ==2){	
	System.out.println("Goodbye!!");
	return false;
	}		
	return true;
}

}//end of class


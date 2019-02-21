package SemesterProject;

/* Name: Skyler Reep
 * Date: 4/23/2018
 * Assignment: Semester Project Part C
 * 
 * Pseudocode
 * 
 * Initialize all variables
 * Prompt the user to input their pin to logon
 * Store the user's pin entry
 * Do the following once and continue repeating it as long as the exitFlag is not switched to true
 * 		If the login method validates the user's pin entry
 * 			Display the program menu to the user
 * 			Try to
 * 				Prompt the user to select which tool they wish to use and store the value
 * 				Store the user's tool choice
 * 				If the user chose option 1 (wage calculator)
 * 					Enter the wage calculator method 
 * 					Increment the total number of wages calculated
 * 				Else if the user chose option 2 (tip calculator)
 * 					Call the tip calculator method and store it's resulting array
 * 					Set the dinners array at the current counter element equal to the dinner total in position 0 of the returned tip calc array
 * 					Set the tips array at the current counter element equal to the tips total in position 1 of the returned tip calc array
 * 					Increment the total number of tips calculated
 * 				Else if the user chose option 3 (wage report)
 * 					Call the wage report method
 * 				Else if the user chose option 4 (tip report)
 * 					Call the tip report method and pass it the array containing all stored tips, the array containing all stored dinners
 * 					As well as the total number of tips calculated
 * 				Else if the user chose option 5 (Exit)
 * 					Display a message to the user confirming whether they wish to exit, login with another pin, or continue without exiting
 * 					Prompt the user for their choice
 * 					If the user chose to exit
 * 						Switch the exit flag to true
 * 						Display the total number of tips calculated, and wages calculated, followed by an exit message
 * 					Else if the user chose to login with another pin
 * 						Prompt the user to enter the new pin
 * 						Store the user's new pin entry
 * 					Otherwise
 * 						The exit flag remains false
 * 				Otherwise
 * 					Display an error message to the user explaining their menu selection options
 * 			Catch
 * 				Any InputMismatchExceptions
 * 				Display a message to the user stating 'numerical entries only'
 * 				Set the exit flag as true to prevent continued looping
 * 		Otherwise
 * 			Try to 
 * 				Display a message telling the user that the pin is not on record
 * 				Prompt the user to register a new account by entering their desired pin
 * 				Store the value in the position of the validPasswords array that is equivalent to the counter of the number of total users
 * 				Increment the number of current total users
 * 				Prompt the user to input their pin and store the value
 * 			If there are no available elements in the validPasswords array
 * 				Display a message to the user letting them know that the program has reached maximum user capacity
 * Display a message to the user thanking them for using the program
 * 
 * (login)
 * Initialize all variables
 * For each element in the validPasswords array
 * 		If the user pin input is equal to any element in the array
 * 		Return that the password is valid
 * Return that the password is invalid
 * 
 * (option_1)
 * Initialize all variables
 * Try to
 * 		Prompt the user to input their name and store the value
 * 		Prompt the user to input their hourly wage and store the value
 * 		If the user input an hourly wage less than 0
 * 			Display an error to the user asking them to user positive numbers and exit to menu
 *		Prompt the user to input their regular hours worked and store the value
 * 		If the user input an hours value less than 0
 * 			Display an error to the user asking them to user positive numbers and exit to menu
 * 		If the user's regular hours worked input is equal to, or exceeds 40
 * 			Prompt the user to input how many hours of overtime they worked and store the value
 * 			If the user input an overtime hours value less than 0
 * 				Display an error to the user asking them to user positive numbers and exit to menu
 * 			Set the regular hours equal to the maximum of 40 (In case they input a larger number)
 * 		Call the wage_calc method and store the results in an array
 * 		Display a personalized greeting to the user
 * 		If the user had 0 overtime hours
 * 			Display their regular hours worked
 * 		Otherwise
 * 			Display their number of regular hours worked (40), their number of overtime hours worked, and their overtime pay
 * 		Display the user's regular pay
 * 		Display the user's total pay
 * 		Display a thank you message to the user
 * 		Call the wage_writer method and pass it the results array, the user's name, the regular hours, and the overtime hours
 * Catch
 * 		Any input mismatch exceptions 
 * 		Display an error to the user
 * Catch
 * 		Any negative entries 
 * 		Display an error to the user
 * 
 * (wage_writer)
 * Initialize all variables
 * Create a new file class 
 * Try
 * 		If a file by the same name as the one listed in the file class does not exists
 * 			Create a new one by the same name
 * 		Create a FileWriter targeting the file class, with the append ability set to true
 * 		Append a line of text to the File containing the user's wage calculator results and labelling
 * 		Close the FileWriter
 * Catch
 * 		Any IOExceptions
 * 		Display an error to the user stating that the data could not be successfully logged
 * 
 * (wage_calc)
 * Initialize all variable
 * If the user has 0 overtime hours
 * 		Calculate the total pay by multiplying wage*hours
 * 		Calculate the regular pay by multiplying wage*hours
 * 		Set the number of overtime hours equal to 0
 * 		Store the regular pay, total pay, and overtime hours in an array and return the array
 * Otherwise
 * 		Calculate the regular pay by multiplying wage*40 (maximum number of regular hours)
 * 		Calculate the overtime pay by multiplying overtime hours*(wage*1.5)
 * 		Calculate the total pay by adding the regular pay to the overtime pay
 * 		Store the regular pay, overtime pay, and total pay into an array and return the array
 * 
 * (option_2)
 * Initialize all variables
 * Try to
 * 		Prompt the user for their satisfaction level and store the value
 * 		If the user's satisfaction level input isn't 1, 2, or 3
 * 			Throw IllegalArgumentException
 * 		Prompt the user for their dinner total and store the value
 * 		If the user's dinner total is less than 0
 * 			Throw IllegalArgumentException
 * 		If the user chose that they were totally satisfied
 * 			Calculate the tip total by multiplying the dinner total*0.2
 *		Else if the user chose that they were somewhat satisfied
 * 			Calculate the tip total by multiplying the dinner total*0.15
 * 		Else if the user chose that they were dissatisfied
 * 			Calculate the tip total by multiplying the dinner total*0.10
 * 		Otherwise
 * 			Display a message to the user stating that their entry was invalid and ask them to try again
 * 		Display the user's tip amount
 * 		Display the user's satisfaction level
 * 		Display the user's final total
 * 		Display a thank you message to the user
 * 		Store the dinner total and the tip total in an array
 * Catch
 * 		Any input mismatch exceptions
 * 		Display an error to the user
 * Catch
 * 		Any illegal argument exceptions
 * 		display an error to the user
 * 
 * (tip_report)
 * Initialize all values
 * For every element in the dinners and tips arrays
 * 		Set the dinner sum equal to the current dinner sum plus the element at the current position in the dinners array
 * 		Set the tip sum equal to the current tip sum plus the element at the current position in the tips array
 * Display the total of the tips collected in dollars and cents
 * Display the total of the dinners collected in dollars and cents
 * 
 * (wage_report)
 * Initialize all variable
 * Try to
 * 		Create a new File Class and Scanner for said class
 * 		While the file has another line of text
 * 			Display the line of text to the user
 * Catch
 * 		Any FileNotFoundExceptions
 * 			Display an error to the user stating that a file containing the wage data could not be found
 */
import java.util.*;
import java.io.*;
public class PartC_V2_SkylerReep {
	public static void main(String[] args) throws FileNotFoundException {
		boolean exitFlag = false;
		int currentUsers = 0;
		//boolean validPass = false; DELET DIS
		String [] validPasswords = new String[5]; // LIMIT OF 5 FOR TESTING - SUBJ. TO CHANGE
		Double [] tips = new Double [100]; // LIMIT OF 100 FOR TESTING - SUBJ. TO CHANGE
		Double [] dinners = new Double [100]; // LIMIT OF 100 FOR TESTING - SUBJ. TO CHANGE
		Scanner in = new Scanner(System.in);
		int progChoice = 0;
		int exitChoice = 0;
		int wagesTotal = 0;
		int tipsTotal = 0;
		
		
		System.out.print("Please enter your PIN to login: ");
		String userPass = in.nextLine(); //Stored and used as a string so user's can use any combination of letters, numbers, and special characters
		
		do {
			if(login(userPass, validPasswords) == true) {
				System.out.println("Calculator Menu \n1) Wage Calculator \n2) Tip Calculator \n3) Wage Report"
						+ "\n4) Tip Report \n5) Exit");
				try {
					System.out.print("Please enter your choice: "); 
					progChoice = in.nextInt();
					
					switch (progChoice){
					case 1: // Wage Calculator
						option_1();
						wagesTotal++;
						break;
					case 2: // Tip Calculator
						double [] tipCalcResults = option_2();
						dinners[tipsTotal] = tipCalcResults[0];
						tips[tipsTotal] = tipCalcResults[1];
						tipsTotal++;
						break;
					case 3: // Wage Report
						wage_report();
						break;
					case 4: // Tip Report
						tip_report(dinners, tips, tipsTotal);
						break;
					case 5: // Exit
						System.out.print("Are you sure you want to exit? Enter '1' to exit, '2' to login "
								+ "with another PIN, or '3' to continue: ");
						exitChoice = in.nextInt();
						if (exitChoice == 1) {
							exitFlag = true;
							System.out.println(wagesTotal + " Wages Calculated.");
							System.out.println(tipsTotal + " Tips Calculated.");
						}
						else if (exitChoice == 2) {
							System.out.print("Please enter the new user PIN: ");
							userPass = in.next();
							exitFlag = false;
						}
						else {
							exitFlag = false;
						}
						break;
					default:
						System.out.println("You must enter a menu selection of '1', '2', '3', '4', or '5'.");
					}
				} catch (InputMismatchException e) {
					System.out.println("ERROR - Numerical Entries Only - Program will now exit. Please try again.");
					exitFlag = true;
				}
			}
			else {
				try {
					System.out.print("That PIN is not currently on record. "
							+ "Please enter a PIN in order to register as a new user: ");
					validPasswords[currentUsers] = in.next();
					currentUsers++;
					System.out.print("Please enter your PIN to login: ");
					userPass = in.next();
				}
				catch (IndexOutOfBoundsException e) {
					System.out.print("Sorry, we have reached our maximum number of users.\n");
					exitFlag = true;
				}
			}
		} while (exitFlag == false);
		System.out.println("Thank you for using my program!"); //Exit statement
		in.close();
	}
	
	/** login					Compares the user's password to those stored in the validPasswords array
	 * 	@param userpass			The user's password input
	 * 	@param validPasswords	The array containing all of the currently stored passwords
	 * 	@return boolean			True if the user's password is in the validPasswords array, false otherwise
	 */
	public static boolean login(String userPass, String [] validPasswords) {
		for (int i=0; i<validPasswords.length; i++) {
			if (userPass.equals(validPasswords[i])){
				return true; //Validates if the input password has already been stored in the validPasswords
			}
		}
		return false; // Password not currently stored
	} //login
	
	/** option_1	Obtains required input for wage calculations and displays results of wage_calc to the user
	 */
	public static void option_1(){
		double overtimeHours = 0; double wage = 0; double hours = 0;
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Please enter your name: ");
			String userName = in.nextLine();
			
			System.out.print("Please enter your salary (hourly wage): ");
			wage = in.nextDouble();
			if (wage < 0) {
				throw new IllegalArgumentException();
			}
			
			System.out.print("Please enter your regular hours worked in the last week: ");
			hours = in.nextDouble();
			if (hours < 0) {
				throw new IllegalArgumentException();
			}
			
			if (hours >= 40) {
				System.out.print("Please enter your hours of overtime worked in the last week: ");
				overtimeHours = in.nextDouble();
				if (overtimeHours < 0) {
					throw new IllegalArgumentException();
				}
				hours = 40; // Prevents regular hours from exceeding maximum
			}
			double [] results = wage_calc(wage, hours, overtimeHours);
			System.out.println("Hello " + userName);
			if (overtimeHours == 0) {
				System.out.print("Your hours worked: " + hours);
			}
			else {
				System.out.print("Your regular hours worked: 40.0 \nYour overtime hours "
						+ "worked: " + overtimeHours); // Only prints overtime hours when there are any
				System.out.printf("\nYour overtime pay: $%.2f", results[2]); 
			}
			System.out.printf("\nYour regular pay: $%.2f", results[0]);
			System.out.printf("\nYour total pay: $%.2f\n", results[1]);
			System.out.println("Thank you for using the wage calculator " + userName + ".");
			
			wage_writer(results, userName, hours, overtimeHours);
		} catch (InputMismatchException e) {
			System.out.println("Error - Numerical entries expected - Please try again");
		} catch (IllegalArgumentException e) {
			System.out.println("Error - Please input only positive numbers - Try again");
		} 
	} // option_1
	
	/** wage_writer				Logs the wage calculator results with labels in a .txt file
	 * 	@param results			Array containing the regular pay, total pay, and overtime pay
	 * 	@param userName			The user's name
	 * 	@param hours			The user's regular hours
	 * 	@param overtimeHours	The user's overtime hours
	 */
	public static void wage_writer(double [] results, String userName, double hours, double overtimeHours) {
		File wageLog = new File("wageLog.txt");
		try{
			if(wageLog.exists()==false){
			    wageLog.createNewFile(); // No pre-existing file by that name
			    }
			FileWriter out = new FileWriter(wageLog, true);
			out.append("Username: " + userName + " " + "Regular Hours: " + hours + " " + "Overtime Hours: "
					+ overtimeHours + " " + "Regular Pay: "+ results[0] + " " + "Overtime Pay: " + results[2] + " "
			    	+ "Total Pay: "+ results[1] + " " + "\n"); // wage_calc data and labels
			out.close();
			}catch(IOException e){
				System.out.println("Error - Could Not Log Data");
			 }
	}//wage_writer
	
	/** Calculates wages for option_1 based on the user's input
	 * @param wage 			The user's hourly wage
	 * @param hours			The number of hours the user worked
	 * @param overtimeHours	The number of overtime hours the user worked
	 * @return results		An array containing the results of the wage calculations
	 */
	public static double[] wage_calc(double wage, double hours, double overtimeHours){
		if (overtimeHours == 0) { // Only runs if the user had no overtime hours to calculate
			double totalPay = hours*wage;
			double regularPay = hours*wage;
			double overtimePay = 0; // Redundant but required to prevent array out of bounds in wage_writer
			double [] results = {regularPay, totalPay, overtimePay};
			return results;
		}
		else {
			double regularPay = 40*wage;
			double overtimePay = overtimeHours*(wage*1.5); // Overtime wage is 150% of regular wage
			double totalPay = overtimePay+regularPay;
			double [] results = {regularPay, totalPay, overtimePay};
			return results;
		}
	} // wage_calc
	
	/** option_2				Tip calculator
	 * 	@return	tipCalcResults	An array containing the dinner amount and tip amount
	 */
	public static double[] option_2(){
		double tipTotal = 0;
		double [] tipCalcResults = new double[2];
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter your satisfaction level (1=Totally Satisfied, "
					+ "2=Satisfied, 3=Dissatisfied): ");
			int satisfactionNum = in.nextInt();
			if (satisfactionNum < 0 || satisfactionNum > 3) {
				throw new IllegalArgumentException();
			}
		
			System.out.print("Please enter your dinner total: ");
			double dinnerTotal = in.nextDouble();
			if (dinnerTotal < 0) {
				throw new IllegalArgumentException();
			}
			String satisfactionText = null;
			switch(satisfactionNum) // DETERMINES TIP BASED ON SATISFACTION LEVEL
			{
			case 1:
				tipTotal = dinnerTotal*0.2; // 20% tip
				satisfactionText = " (Totally Satisfied). ";
				break;
			case 2:
				tipTotal = dinnerTotal*0.15; // 15% tip
				satisfactionText = " (Satisfied). ";
				break;
			case 3:
				tipTotal = dinnerTotal*0.10; // 10% tip
				satisfactionText = " (Dissatisfied). ";
				break;
			default:
				System.out.println("Invalid entry, please enter a satisfaction level of 1, 2, or 3.");
				break;
			}
			System.out.printf("Your tip amount is: $%.2f", tipTotal); 
			System.out.println(satisfactionText); 
			System.out.printf("Your final total is: $%.2f", (dinnerTotal+tipTotal));
			System.out.println("\nThank you for using the Tip Calculator!");
			tipCalcResults[0] = dinnerTotal;
			tipCalcResults[1] = tipTotal;
		} catch (InputMismatchException e) {
			System.out.println("Error - Numerical entries expected - Please try again");
		} catch (IllegalArgumentException e) {
			System.out.println("Error - Please input only, '1', '2', or '3', for your satisfaction selection - Try again");
		} 
		return tipCalcResults; // Separated in the main method once returned
	} // option_2
	
	/** tip_report		Displays the total dollar amount of tips and dinners calculated at this point
	 * 	@param dinners	An array containing the dinner total of every dinner calculation
	 * 	@param tips 	An array containing the tips total of every tip calculation
	 */
	public static void tip_report(Double[] dinners, Double[] tips, int tipsTotal) {
		double dinnersSum = 0;
		double tipsSum = 0;
		for (int i=0; i<tipsTotal; i++) {
			dinnersSum = dinnersSum + dinners[i];
			tipsSum = tipsSum + tips[i];
		}
		System.out.printf("Total tips collected: $%.2f\n", tipsSum);
		System.out.printf("Total dinners sold: $%.2f\n", dinnersSum);
	}
	
	/**	wage_report		Displays every set of wage calculation data points and their labels
	 */
	public static void wage_report() {
		try {
			File wageLog = new File("wageLog.txt");
			Scanner wageScanner = new Scanner(wageLog);
			while (wageScanner.hasNextLine()) {
				System.out.println(wageScanner.nextLine());
			}
			wageScanner.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Sorry, we couldn't find a file containing wage data.");
		}
	} //wage_report
}

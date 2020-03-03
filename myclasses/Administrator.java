package myclasses;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

/** Represents an Administrator.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

public class Administrator implements Admin{

	private String name;
	private String surname;

/** Represents the administrator properties.
*/
	


/** Creates an Administrator 
 * @param name The Administrator's name.
 * @param surname The Administrator surname.
*/
	public Administrator(String name,String surname){

		this.name = name;
		this.surname = surname;
	}

	/**
	 * @return current name.
 	*/
	public String getName(){
		return name;
	}
	/**
 	* @return current surname.
	 */
	public String getSurname(){
		return surname;
	}

	/**
 	* @param name name to set.
 	*/
	public void setName(String name){
		this.name = name;
	}

	/**
 	* @param surname surname to set.
 	*/
	public void setSurname(String surname){
		this.surname = surname;
	}


   
   /**
   * This method is used to add new branch to BranchArray. 
   * @param BranchArray This is the parameter of addBranch method.
   */


	public void addBranch(ArrayList<Branch> BranchArray){

			Scanner myObj2 = new Scanner(System.in);

						System.out.println("ENTER BRANCH NAME");

						Branch newBranch = new Branch( myObj2.nextLine());

						BranchArray.add(newBranch);

						System.out.println("Branch Created!");

						System.out.println("ALL BRANCHS :");

						for (int i=0 ; i<BranchArray.size() ; i++ ) {
						
							System.out.println(BranchArray.get(i).getBranchName());
						}
	}

   /**
   * This method is used to remove a branch from BranchArray. 
   * @param BranchArray This is the parameter of removeBranch method.
   */

	public void removeBranch(ArrayList<Branch> BranchArray){

		String userInputString;

		int flagFound = 0;

		Scanner myObj2 = new Scanner(System.in);

		System.out.println("ALL BRANCHES :");

						for (int i=0; i<BranchArray.size() ; i++ ) {
							
								System.out.println(BranchArray.get(i).getBranchName());	
						}

						System.out.println("ENTER BRANCH NAME TO DELETE");

						userInputString = myObj2.nextLine();

						for (int i=0 ; i<BranchArray.size() ; i++) {

							if (userInputString.equals(BranchArray.get(i).getBranchName())) { 

								flagFound = 1;

								BranchArray.remove(i);

								System.out.println("Branch Deleted!");
							
								}
							
						}

						if (flagFound == 0) {

						System.out.println("Branch Not Found!");
						
					}


	}

   /**
   * This method is used to add a branch employee to BEArray. 
   * @param BEArray This is the parameter of addBranchEmployee method.
   */

	public void addBranchEmployee(ArrayList<BranchEmployee> BEArray){

		String stringInput1;
		String stringInput2;



		Scanner myObj3 = new Scanner(System.in);

		System.out.println("ALL BRRANCH EMPLOYEE :");

						for (int i=0 ; i<BEArray.size() ;i++ ) {
								
								System.out.println(BEArray.get(i).getName() +
								 " "+ BEArray.get(i).getSurname());
							
						}

						System.out.println("ENTER BRANCH EMPLOYEE's NAME ");

						stringInput1 = myObj3.nextLine();

						System.out.println("ENTER BRANCH EMPLOYEE's SURNAME ");

						stringInput2 = myObj3.nextLine();

						BranchEmployee newBranchEmployee = new BranchEmployee(stringInput1,stringInput2);

						BEArray.add(newBranchEmployee);

						System.out.println("Branch Employee Created!");

	}

   /**
   * This method is used to remove a branch employee from BEArray. 
   * @param BEArray This is the parameter of removeBranchEmployee method.
   */

	public void removeBranchEmployee(ArrayList<BranchEmployee> BEArray){

		String stringInput1;
		String stringInput2;

		int flagFound = 0;

		Scanner myObj3 = new Scanner(System.in);

		System.out.println("ALL BRRANCH EMPLOYEE :");

						for (int i=0; i<BEArray.size() ;i++ ) {
								
								System.out.println(BEArray.get(i).getName() +
								 " "+ BEArray.get(i).getSurname());
	
						}


						System.out.println("ENTER BRANCH EMPLOYEE's NAME ");

						stringInput1 = myObj3.nextLine();

						System.out.println("ENTER BRANCH EMPLOYEE's SURNAME ");

						stringInput2 = myObj3.nextLine();


						for (int i=0; i<BEArray.size() ;i++) {

							if (stringInput1.equals(BEArray.get(i).getName())  &&
							 stringInput2.equals(BEArray.get(i).getSurname())) { 

								System.out.println("Branch Employee Deleted!");

								flagFound = 1;
								}
							
						}

					if (flagFound == 0) {

						System.out.println("Branch Employee Not Found!");
						
					}

}

	/**
   * This method is used to add a transportation employee to TEArray. 
   * @param TEArray This is the parameter of addTransportationEmployee method.
   */

	public void addTransportationEmployee(ArrayList<TransportationEmployee> TEArray){

		String stringInput1;
		String stringInput2;

		Scanner myObj3 = new Scanner(System.in);

		System.out.println("ALL TRANSPORTATION EMPLOYEE :");

						for (int i=0; i<TEArray.size() ;i++ ) {
							
								System.out.println(TEArray.get(i).getName() +
								 " "+ TEArray.get(i).getSurname());
					
						}


						System.out.println("ENTER TRANSPORTATION EMPLOYEE's NAME ");

						stringInput1 = myObj3.nextLine();

						System.out.println("ENTER TRANSPORTATION EMPLOYEE's SURNAME ");

						stringInput2 = myObj3.nextLine();

						TransportationEmployee newBranchEmployee =
						 new TransportationEmployee(stringInput1,stringInput2);

						TEArray.add(newBranchEmployee);

						System.out.println("Transportation Employee Created!");

	}

	/**
  	* This method is used to remove a transportation employee from TEArray. 
  	* @param TEArray This is the parameter of removeBranchEmployee method.
   	*/

	public void removeTransportationEmployee(ArrayList<TransportationEmployee> TEArray){

		String stringInput1;
		String stringInput2;

		int flagFound=0;

		Scanner myObj3 = new Scanner(System.in);

		System.out.println("ALL TRANSPORTATION EMPLOYEE :");

						for (int i=0 ; i<TEArray.size() ;i++ ) {
								
								System.out.println(TEArray.get(i).getName() +
								 " "+ TEArray.get(i).getSurname());
							
						}


						System.out.println("ENTER TRANSPORTATION EMPLOYEE's NAME ");

						stringInput1 = myObj3.nextLine();

						System.out.println("ENTER TRANSPORTATION EMPLOYEE's SURNAME ");

						stringInput2 = myObj3.nextLine();



						for (int i=0 ; i<TEArray.size() ;i++ ) {

							if (stringInput1.equals(TEArray.get(i).getName())  &&
							 stringInput2.equals(TEArray.get(i).getSurname())) { 
								
								TEArray.remove(i);

								System.out.println("Transportation Employee Deleted!");

								flagFound = 1;
								}
							
						}

					if (flagFound == 0) {

						System.out.println("Transportation Employee Not Found!");
						
					}

		}
				

	/**
  	* This method is used to show all properties. 
  	* @param BranchArray This is the first parameter of showAllBranches method.
  	* @param BEArray This is the second parameter of showAllBranches method.
  	* @param TEArray This is the third parameter of showAllBranches method.
   	*/
					

	public void showAllBranches(ArrayList<Branch> BranchArray,
		ArrayList<BranchEmployee> BEArray,
		ArrayList<TransportationEmployee> TEArray){


		System.out.println("ALL BRANCHES :");

						for (int i=0 ; i<BranchArray.size() ;i++ ) {
								
								System.out.println(BranchArray.get(i).getBranchName());
							
						}

		System.out.println("ALL BRRANCH EMPLOYEE :");

						for (int i=0 ; i<BEArray.size() ;i++ ) {
								
								System.out.println(BEArray.get(i).getName() +
								 " "+ BEArray.get(i).getSurname());

						}


		System.out.println("ALL TRANSPORTATION EMPLOYEE :");

						for (int i=0 ; i<TEArray.size() ;i++ ) {
								
								System.out.println(TEArray.get(i).getName() +
								 " "+ TEArray.get(i).getSurname());
							
						}
						
	}






}
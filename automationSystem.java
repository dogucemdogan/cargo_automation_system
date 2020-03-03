import java.util.Scanner;
import myclasses.*;
import java.util.ArrayList; // import the ArrayList class
import java.util.InputMismatchException;

/**
* <h1>CargoAutomationSystem</h1>
* The Automation program implements a cargo menagement for cargo
*company
* <p> 
*
* @author  Dogu Cem Dogan
* @version 2.0
* @since   2020-03-02 
*/


class automationSystem{

/**
* This is the main method which organises menu transitions
*and checks some conditions.
* @param args Unused.
* @return Nothing.
* @exception IOException On input error.
* @see IOException
*/
 
	public static void main(String[] args) {

   		int userInput;

		String userInputString;

		ArrayList<BranchEmployee> BEArray = new ArrayList<BranchEmployee>();

		ArrayList<TransportationEmployee> TEArray = new ArrayList<TransportationEmployee>();

		ArrayList<Shipment> ShipmentArray = new ArrayList<Shipment>();

		ArrayList<Branch> BranchArray = new ArrayList<Branch>();

		Administrator admin1 = new Administrator("admin","admin");  //creating admin object




		while(true){

			Menu.welcomingMenu();

			Scanner myObj = new Scanner(System.in);

			Scanner myObj4 = new Scanner(System.in);


		try{

				userInput = myObj.nextInt();


			switch(userInput){

				case 1:

					while(true){ // Show again menu when process is completed.

					Menu.menuAdministrator();

					userInput = myObj.nextInt();

					if (userInput == 8) {  // back to previous page
						break; 
					}

					else if (userInput == 7){
						admin1.showAllBranches(BranchArray,
							BEArray,TEArray);
					}

					else if (userInput == 6){

						admin1.removeTransportationEmployee(TEArray);
						
					}
					else if (userInput == 5){

						admin1.addTransportationEmployee(TEArray);
						
					}
					else if (userInput == 4){

						admin1.removeBranchEmployee(BEArray); 
						
					}
					else if (userInput == 3){ //add branch employee

						admin1.addBranchEmployee(BEArray);
						
					}
					else if (userInput == 2){ //remove branch

						admin1.removeBranch(BranchArray); 
						
					}
					else if (userInput == 1){  //add branch

						admin1.addBranch(BranchArray);
					}

					}

					break;

				case 2:

					String inputString1;
					String inputString2;

					int flagFound=0;

					BranchEmployee tempBE;


					System.out.println("ENTER BRANCH EMPLOYEE NAME");
					inputString1 = myObj4.nextLine();

					System.out.println("ENTER BRANCH EMPLOYEE SURNAME");
					inputString2 = myObj4.nextLine();


					for (int i=0; i<BEArray.size(); i++) {


							if (inputString1.equals(BEArray.get(i).getName())
							 && inputString2.equals(BEArray.get(i).getSurname())) {

								tempBE = BEArray.get(i);

								flagFound = 1;
								System.out.println("EMPLOYEE ACCESS COMFIRMED");


								while(true){ // Show again menu when process is completed.
	
								Menu.menuBranchEmployee();
	
								userInput = myObj.nextInt();
	
								if (userInput == 5) {
									break; // back to previous page
								}
								else if (userInput == 4){
	
									tempBE.declareLeft(ShipmentArray);
	
							
								}
								else if (userInput == 3){
	
									tempBE.removeShipment(ShipmentArray);
							
								}
								else if (userInput == 2){
	
									tempBE.addShipment(ShipmentArray);
							
								}
								else if (userInput == 1){
	
									tempBE.showAllShipment(ShipmentArray);
						
								}

							}


						}
					}


	

					if(flagFound == 0){
						System.out.println("ACCESS DENIED!!!!!!");
					}

					break;

				

				case 3:

					String inputString3;
					String inputString4;

					int flagFound2=0;

					TransportationEmployee tempTE;


					System.out.println("ENTER TRANSPORTATION EMPLOYEE NAME");
					inputString3 = myObj4.nextLine();

					System.out.println("ENTER TRANSPORTATION EMPLOYEE SURNAME");
					inputString4 = myObj4.nextLine();


					for (int i=0; i<TEArray.size(); i++) {
	
							if (inputString3.equals(TEArray.get(i).getName()) &&
								 inputString4.equals(TEArray.get(i).getSurname())) {
								tempTE = TEArray.get(i);
								flagFound2 = 1;
								System.out.println("EMPLOYEE ACCESS CONFIRMED");

								while(true){ // Show again menu when process is completed.
			
									Menu.menuTransportationEmployee();
			
									userInput = myObj.nextInt();
			
									if (userInput == 2) {
										break; // back to previous page
									}
									else if (userInput == 1){
			
										tempTE.declareDelivered(ShipmentArray);
										
									}
			
								}

							}
					}

				if(flagFound2 == 0){
						System.out.println("ACCESS DENIED!!!!!!");
					}
				break;

				case 4:

					String inputString5;

					int flagFound3 = 0;

					while(true){ // Show again menu when process is completed.

					Menu.menuCustomer();

					userInput = myObj.nextInt();

					if (userInput == 2) {

						break; // back to previous page
					}
					else if (userInput == 1){ // Cargo Tracking

						System.out.println("ENTER TRACKING NUMBER");

							inputString5 = myObj4.nextLine();

						for (int i=0; i<ShipmentArray.size(); i++) {  //Checking for if Shipment is present or not.

								if (inputString5.equals(ShipmentArray.get(i).getTrackingNumber())) {

									flagFound3 = 1;

									Sender newSender = new Sender();

									newSender.showAllInformation(ShipmentArray.get(i));
									
								}	
							
						}
						
					}


				if (flagFound3 == 0) { 

						System.out.println("Tracking Number Not Found!");
						
					}

				}

					break;
			
    		}



		}

		catch(InputMismatchException e){

			System.out.println("Error: Wrong Input!! Please Enter Menu Number  ");

		}
			

			
		}		
			
	}

	
}
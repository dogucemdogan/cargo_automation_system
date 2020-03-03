package myclasses;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

/** Represents an BranchEmployee.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

public class BranchEmployee extends Employee{

	/**
    * Class constructor specifying branch employee's name, surname and.
    */

	public BranchEmployee(String name,String surname){
		super(name,surname);
	}

	/**
   * This method is used to add a new shipment to ShipmentArray. 
   * @param ShipmentArray This is the parameter of addShipment method.
   */

	public void addShipment(ArrayList<Shipment> ShipmentArray ){

		Scanner myObj5 = new Scanner(System.in);

		String inputString1;
		String inputString2;
		String inputString3;
		String inputString4;
		String inputString5;
		String inputString6;
		String inputString7;

		System.out.println("ENTER Tracking Number");

		inputString1 = myObj5.nextLine();

		System.out.println("ENTER Sender Name");

		inputString2 = myObj5.nextLine();

		System.out.println("ENTER Sender Surname");

		inputString3 = myObj5.nextLine();

		System.out.println("ENTER Sender Address");

		inputString4 = myObj5.nextLine();

		System.out.println("ENTER Reciever Name");

		inputString5 = myObj5.nextLine();

		System.out.println("ENTER Reciever Surname");

		inputString6 = myObj5.nextLine();

		System.out.println("ENTER Reciever Address");

		inputString7 = myObj5.nextLine();

		Shipment newShipment = new Shipment(inputString1,inputString2,inputString3,inputString4,inputString5,inputString6,inputString7);

		ShipmentArray.add(newShipment);

		System.out.println("Shipment Added");



	}

	/**
   * This method is used to remove a shipment from ShipmentArray. 
   * @param ShipmentArray This is the parameter of removeShipment method.
   */

	public void removeShipment(ArrayList<Shipment> ShipmentArray){


		Scanner myObj6 = new Scanner(System.in);

		String inputString1;

		int flagFound = 0;

		System.out.println("ENTER Tracking Number TO DELETE");

		inputString1 = myObj6.nextLine();

		for (int i=0; i<ShipmentArray.size() ;i++ ) {
							



					if (inputString1.equals(ShipmentArray.get(i).getTrackingNumber())) {
									
						ShipmentArray.remove(i);

						flagFound = 1;

						System.out.println("Shipment Deleted");
						}
								
							
						}


		if (flagFound == 0) {

						System.out.println("Tracking Number Not Found!");
						
					}

	}

	/**
   * This method is used to declare whether shipment is left from branch.
   * or shipment is still in branch. 
   * when this method is called, variable setTransportationInProgress is true,
   * otherwise is false.
   * @param ShipmentArray This is the parameter of declareLeft method.
   */

	public void declareLeft(ArrayList<Shipment> ShipmentArray){


		Scanner myObj7 = new Scanner(System.in);

		String inputString1;

		int flagFound = 0;

		System.out.println("ENTER Tracking Number TO Declare it is left from Branch");

		inputString1 = myObj7.nextLine();

			for (int i=0; i<ShipmentArray.size() ;i++ ) {
							
				if (inputString1.equals(ShipmentArray.get(i).getTrackingNumber())) {
									
					ShipmentArray.get(i).setTransportationInProgress(true);

					flagFound = 1;

					System.out.println("Shipment is left");
					}			
							
			}

			if (flagFound == 0) {

						System.out.println("Tracking Number Not Found!");
						
					}


	}

	/**
   * This method is used to show tracking number of all shipments.
   * @param ShipmentArray This is the parameter of showAllShipment method.
   */

	@Override
	public void showAllShipment(ArrayList<Shipment> ShipmentArray){

		System.out.println("ALL SHIPMENTS (shown by Branch Employee) : ");

						for (int i=0; i<ShipmentArray.size() ;i++ ) {
								
								System.out.println(ShipmentArray.get(i).getTrackingNumber());
							
						}

	}




}
package myclasses;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class


/** Represents an Transportation Employee.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

public class TransportationEmployee extends Employee{

	/** 
    * Class constructor specifiying name and surname.
    */

	public TransportationEmployee(String name,String surname){
			super(name,surname);
		}

	/**
   * This method is used to declare whether shipment is delivered to customer.
   * when this method is called, variable setCargoDelivered is true,
   * otherwise is false.
   * @param ShipmentArray This is the parameter of declareDelivered method.
   */
	public void declareDelivered(ArrayList<Shipment> ShipmentArray ){


		Scanner myObj8 = new Scanner(System.in);

		String inputString1;

		int flagFound = 0;

		System.out.println("ENTER Tracking Number TO Declare it is left from Branch");

		inputString1 = myObj8.nextLine();

			for (int i=0; i<ShipmentArray.size() ;i++ ) {

				if (inputString1.equals(ShipmentArray.get(i).getTrackingNumber())) {
							
									ShipmentArray.get(i).setCargoDelivered(true);

									flagFound = 1;

									System.out.println("Shipment is delivered");
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

		System.out.println("ALL SHIPMENTS (shown by Transportation Employee):");

						for (int i=0; i<ShipmentArray.size() ;i++ ) {
								
								System.out.println(ShipmentArray.get(i).getTrackingNumber());
							
						}

	}
	

}
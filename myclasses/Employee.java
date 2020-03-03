package myclasses;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

/** Represents an Employee.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/


public class Employee{

	/** Represents the employees properties.
	*/

	private String name;
	private String surname;

	

	/** 
    * Class constructor specifiying name and surname.
    */
	public Employee(String name,String surname){
		this.name = name;
		this.surname = surname;
	}

	/** 
    * Class overloaded constructor specifiying only name .
    */
	public Employee(String name){
		this.name = name;
		this.surname = "UNKNOWN";
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
   * This method is used to show tracking number of all shipments.
   * @param ShipmentArray This is the parameter of showAllShipment method.
   */

	public void showAllShipment(ArrayList<Shipment> ShipmentArray){

		System.out.println("ALL SHIPMENTS :");

						for (int i=0; i<ShipmentArray.size() ;i++ ) {
								
								System.out.println(ShipmentArray.get(i).getTrackingNumber());
							
						}

	}


}
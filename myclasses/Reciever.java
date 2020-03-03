package myclasses;

/** Represents an Reciver.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

public class Reciever implements Customer{

	/** Represents the Reciver properties.
	*/

	private String recieverName;
	private String recieverSurname;
	private String recieverAddress;

	/** 
    * Class constructor.
    */

	public Reciever(String recieverName,String recieverSurname,
		String recieverAddress){

		this.recieverName = recieverName;
		this.recieverSurname = recieverSurname;
		this.recieverAddress =recieverAddress;

	}
	/** 
    * Class overloaded constructor specifiying name and surname.
    */
	public Reciever(String recieverName,String recieverSurname){

		this.recieverName = recieverName;
		this.recieverSurname = recieverSurname;
		this.recieverAddress = "UNKNOWN";

	}
	/** 
    * Class overloaded constructor specifiying name.
    */
	public Reciever(String recieverName){

		this.recieverName = recieverName;
		this.recieverSurname = "UNKNOWN";
		this.recieverAddress = "UNKNOWN";

	}
	/** 
    * Class overloaded constructor.
    */
	public Reciever(){

		this.recieverName = "UNKNOWN";
		this.recieverSurname = "UNKNOWN";
		this.recieverAddress = "UNKNOWN";

	}

	/**
 	* @return current name.
	*/
	public String getRecieverName(){
		return recieverName;
	}

	/**
 	* @return current surname.
	*/
	public String getRecieverSurname(){
		return recieverSurname;
	}

	/**
 	* @return current Address.
	*/
	public String getRecieverAddress(){
		return recieverAddress;
	}

	/**
 	* @param recieverName  name to set.
 	*/

	public void setRecieverName(String recieverName){
		this.recieverName = recieverName;
	}

	/**
 	* @param recieverSurname  surname to set.
 	*/
	public void setRecieverSurname(String recieverSurname){
		this.recieverSurname = recieverSurname;
	}
	

	/**
 	* @param recieverAddress  addreess to set.
 	*/
	public void setRecieverAddress(String recieverAddress){
		this.recieverAddress = recieverAddress;
	}


	/**
   * This method is used to show tracking number of all shipments.
   * @param shipment This is the parameter of showAllShipment method.
   */

	
	public void showAllInformation(Shipment shipment){

		System.out.println("ALL INFORMATIONS ABOUT SHIPMENT (Shown by Reciever)");
		System.out.println("Sender Name: " + shipment.getSender().getSenderName());
		System.out.println("Sender Surname: " + shipment.getSender().getSenderSurname());
		System.out.println("Sender Address: " + shipment.getSender().getSenderSurname());
		System.out.println("Reciever Name: " + shipment.getReciever().getRecieverName());
		System.out.println("Reciever Surname: " + shipment.getReciever().getRecieverSurname());
		System.out.println("Reciever Address: " + shipment.getReciever().getRecieverAddress());

		System.out.print("Transportation in progress: ");
		System.out.println(shipment.getTransportationInProgress());

		System.out.print("Cargo is delivered: ");
		System.out.println(shipment.getCargoDelivered());		
	}


}
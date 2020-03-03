package myclasses;

/** Represents an Sender.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/


public class Sender implements Customer{

	/** Represents the sender properties.
	*/

	private String senderName;
	private String senderSurname;
	private String senderAddress;


	/** 
    * Class constructor specifiying name,surname,address.
    */

	public Sender(String senderName,String senderSurname,
		String senderAddress){

		this.senderName = senderName;
		this.senderSurname = senderSurname;
		this.senderAddress = senderAddress;
	}

	/** 
    * Class overloaded constructor specifiying name,surname.
    */
	public Sender(String senderName,String senderSurname){

		this.senderName = senderName;
		this.senderSurname = senderSurname;
		this.senderAddress = "UNKNOWN";
	}

	/** 
    * Class overloaded constructor specifiying name.
    */
	public Sender(String senderName){

		this.senderName = senderName;
		this.senderSurname = "UNKNOWN";
		this.senderAddress = "UNKNOWN";
	}

	/** 
    * Class overloaded constructor.
    */
	public Sender(){

		this.senderName = "UNKNOWN";
		this.senderSurname = "UNKNOWN";
		this.senderAddress = "UNKNOWN";
	}

	/**
 	* @return current name.
	*/

	public String getSenderName(){
		return senderName;
	}

	/**
 	* @return current surname.
	*/

	public String getSenderSurname(){
		return senderSurname;
	}

	/**
 	* @return current Address.
	*/

	public String getSenderAddress(){
		return senderAddress;
	}

	/**
 	* @param senderName  name to set.
 	*/

	public void setSenderName(String senderName){
		this.senderName = senderName;
	}

	/**
 	* @param senderSurname  surname to set.
 	*/
	public void setSenderSurname(String senderSurname){
		this.senderSurname = senderSurname;
	}

	/**
 	* @param senderAddress  address to set.
 	*/
	public void setSenderAddress(String senderAddress){
		this.senderAddress = senderAddress;
	}

	/**
   * This method is used to show tracking number of all shipments.
   * @param shipment This is the parameter of showAllShipment method.
   */

	
	public void showAllInformation(Shipment shipment){

		System.out.println("ALL INFORMATIONS ABOUT SHIPMENT (Shown by Sender)");
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
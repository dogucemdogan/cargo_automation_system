package myclasses;


/** Represents an Shipment.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

public class Shipment{

	private String trackingNumber;
	private boolean cargoDelivered;
	private boolean transportationInProgress;

	private Sender sender;
	private Reciever reciever;
	
	public Shipment(String trackingNumber,String senderName,String senderSurname,
        String senderAddress,String recieverName,String recieverSurname,
        String recieverAddress){

		this.trackingNumber = trackingNumber;
		this.sender = new Sender(senderName,senderSurname,senderAddress);
		this.reciever = new Reciever(recieverName,recieverSurname,recieverAddress);
		this.cargoDelivered = false;
		this.transportationInProgress = false;

	}


	/**
	 * @return current tracking number.
 	*/
	public String getTrackingNumber(){
		return trackingNumber;
	}

	/**
	 * @return current shipment is delivered or not.
 	*/
	public boolean getCargoDelivered(){
		return cargoDelivered;
	}

	/**
	 * @return current sender object.
 	*/
	public Sender getSender(){
		return sender;

	}

	/**
	 * @return current reciever object.
 	*/
	public Reciever getReciever(){
		return reciever;
	}

	/**
	 * @return current sender object.
 	*/
	public boolean getTransportationInProgress(){
		return transportationInProgress;
	}

	/**
 	* @param trackingNumber tracking number to set.
 	*/
	public void setTrackingNumber(String trackingNumber){
		this.trackingNumber = trackingNumber;
	}

	/**
 	* @param cargoDelivered cargo is delivered.
 	*/
	public void setCargoDelivered(boolean cargoDelivered){
		this.cargoDelivered = cargoDelivered; 
	}

	/**
 	* @param transportationInProgress cargo is left from branch.
 	*/
	public void setTransportationInProgress(boolean transportationInProgress){
		this.transportationInProgress = transportationInProgress;
	}

	




}
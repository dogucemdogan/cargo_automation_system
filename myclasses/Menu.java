package myclasses;


public class Menu{

   /**
   * This method is used to display Welcoming menu.
   */

	public static void welcomingMenu(){

		System.out.println("WELCOME TO CARGO AUTOMATION SYSTEM ");
		System.out.println("LOGIN as:");
		System.out.println("1) Administrator");
		System.out.println("2) Branch Employee");
		System.out.println("3) Transportation Personnel");
		System.out.println("4) Customer(Sender or Receiver)");
	
	}

   /**
   * This method is used to display Administrator menu
   * when enter 1 on welcoming menu.
   */

   public static void menuAdministrator(){

		System.out.println("ADMINISTRATOR MENU ");
	
		System.out.println("1) Add Branch");
		System.out.println("2) Remove Branch");
		System.out.println("3) Add Branch Personnel");
		System.out.println("4) Remove Branch Personnel");
		System.out.println("5) Add Transportation Personnel");
		System.out.println("6) Remove Transportation Personnel");
		System.out.println("7) Show All");
		System.out.println("8) Back to Previous Page");
	}
	


	/**
   * This method is used to display Administrator menu
   * when enter 2 on welcoming menu.
   */

	public static void menuBranchEmployee(){

		System.out.println("BRANCH EMPLOYEE MENU ");
		System.out.println("1) Show All Shipment");
		System.out.println("2) Add Shipment");
		System.out.println("3) Remove Shipment");
		System.out.println("4) Declare Shipment left the branch");
		System.out.println("5) Back to Previous Page");
	}

	
	/**
   * This method is used to display Transportation Employee menu
   * when enter 3 on welcoming menu.
   */
	public static void menuTransportationEmployee(){

		System.out.println("TRANSPORTATION EMPLOYEE MENU ");
		System.out.println("1) Declare Shipment is delivered");
		System.out.println("2) Back to Previous Page");
	}


 	/**
   * This method is used to display customer menu
   * when enter 4 on welcoming menu.
   */
	public static void menuCustomer(){

		System.out.println("CUSTOMER MENU ");
		System.out.println("1) Cargo Tracking");
		System.out.println("2) Back to Previous Page");
	}



}
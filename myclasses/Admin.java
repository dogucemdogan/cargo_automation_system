package myclasses;
import java.util.ArrayList; // import the ArrayList class

/* Admin Interface to achive abstraction
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/

interface Admin{ 
	//methods signatures
	abstract void addBranch(ArrayList<Branch> BranchArray);
	abstract void removeBranch(ArrayList<Branch> BranchArray);
	abstract void addBranchEmployee(ArrayList<BranchEmployee> BEArray);
	abstract void removeBranchEmployee(ArrayList<BranchEmployee> BEArray);
	abstract void addTransportationEmployee(ArrayList<TransportationEmployee> TEArray);
	abstract void removeTransportationEmployee(ArrayList<TransportationEmployee> TEArray);
	abstract void showAllBranches(ArrayList<Branch> BranchArray,
		ArrayList<BranchEmployee> BEArray,
		ArrayList<TransportationEmployee> TEArray);
}
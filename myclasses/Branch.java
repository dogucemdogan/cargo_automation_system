package myclasses;

/** Represents an Branch.
 * @author Dogu Cem Dogan
 * @version 2.0
 * @since 2020-03-02 
*/


public class Branch{

 /** Represents the branch propertie.
 */
	private String branchName;

	/**
    * Class constructor specifying branch name.
    */
	public Branch(String branchName){
		this.branchName = branchName;
	}

	/**
 	* @return current branch name.
	*/
	public String getBranchName(){
		return branchName;
	}

	/**
 	* @param branchName  branch name to set.
 	*/
	public void setBranchName(String branchName){
		this.branchName = branchName;
	}
}
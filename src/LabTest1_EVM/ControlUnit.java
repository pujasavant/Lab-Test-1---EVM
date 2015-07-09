package LabTest1_EVM;

/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */

public class ControlUnit {
	Button BallotButton = new Button("BallotButon");
	Button totalButton = new Button("totalButton");
	Button resetButton = new Button("resetButton");
	BallotingUnit bu = new BallotingUnit();
	CUState CUState;
	
	ControlUnit(){
		
	}
	
	
	public void switchCUState(){
		CUState.switchCUState(this);
		System.out.println("CU state: "+CUState);
	}
	
	public void setCUState(CUState cu){
		CUState = cu;
	}
	
}

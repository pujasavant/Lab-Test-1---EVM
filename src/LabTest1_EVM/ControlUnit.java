package LabTest1_EVM;

import java.util.ArrayList;

/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */

public class ControlUnit {
	BallotButton ballotButton;
	Button totalButton;
	Button resetButton;
	BallotingUnit bu = new BallotingUnit();
	CUState CUState;
	ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	ControlUnit(){
		ballotButton = new BallotButton();
		totalButton = new Button("totalButton");
		resetButton = new Button("resetButton");
	}
	
	public void addCandidate(String name){
		Candidate c = new Candidate(name);
		candidates.add(c);
		bu.setCandidateSlot(name);
	}
	
	public void votingProcess(){
		//ballotButton.buttonPressed();
		bu.switchBUState();
	}
	
	public void totalButtonPressed(){
		bu.findTotalVote();
	}
	
	public void switchCUState(){
		CUState.switchCUState(this);
		System.out.println("CU state: "+CUState);
	}
	
	public void setCUState(CUState cu){
		CUState = cu;
	}
	
}

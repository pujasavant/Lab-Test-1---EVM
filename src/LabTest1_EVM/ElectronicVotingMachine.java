package LabTest1_EVM;

/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */

public class ElectronicVotingMachine {
	ControlUnit CU;
	BallotingUnit BU;
	
	ElectronicVotingMachine(){
		CU = new ControlUnit();
		BU = new BallotingUnit();
	}
	
	public void registerCandidate(String name){
		CU.addCandidate(name);
	}
	
	public void registerVote(String candidateName){
		CU.votingProcess(candidateName);
	}
		
}

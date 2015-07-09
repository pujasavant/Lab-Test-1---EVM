package LabTest1_EVM;

public class BallotButton extends Button {

	BallotButton() {
		super("BallotButton");
	}
	
	public String buttonPressed(BallotingUnit bu){
		return bu.switchBUState();
	}

}

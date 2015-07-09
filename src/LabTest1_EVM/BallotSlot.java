package LabTest1_EVM;

public class BallotSlot {
	String CandidateName;
	Button CandidateButton;
	
	BallotSlot(String name){
		CandidateName = name;
		this.CandidateButton = new Button("CandidateButton");
	}

	public String getCandidateName() {
		return CandidateName;
	}
	
}

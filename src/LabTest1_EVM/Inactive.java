package LabTest1_EVM;

public class Inactive extends BUState{

	Inactive(){
		stateName = "Inactive";
	}

	@Override
	public void switchBUState(BallotingUnit bu) {
		Active active = new Active();
		bu.setState(active);
	}
}

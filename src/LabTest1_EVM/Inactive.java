package LabTest1_EVM;

public class Inactive extends BUState{

	Inactive(){
		stateName = "Inactive";
	}

	@Override
	public void switchBUState(BallotingUnit bu) {
		// TODO Auto-generated method stub
		Active inactive = new Active();
		bu.setState(inactive);
	}
}

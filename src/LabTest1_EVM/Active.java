package LabTest1_EVM;

public class Active extends BUState{
	
	Active(){
		stateName = "Active";
	}

	@Override
	public void switchBUState(BallotingUnit bu) {
		// TODO Auto-generated method stub
		Inactive inactive = new Inactive();
		bu.setState(inactive);
	}

}

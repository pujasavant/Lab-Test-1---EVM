package LabTest1_EVM;

public class On extends CUState{

	On(){
		stateName = "On";
	}

	@Override
	public void switchCUState(ControlUnit cu) {
		Busy busy = new Busy();
		cu.setCUState(busy);
	}

}

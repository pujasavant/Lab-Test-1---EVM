package LabTest1_EVM;

public class Busy extends CUState{

	Busy(){
		stateName = "Busy";
	}

	@Override
	public void switchCUState(ControlUnit cu) {
		On on = new On();
		cu.setCUState(on);
	}

}

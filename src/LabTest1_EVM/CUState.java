package LabTest1_EVM;

public abstract class CUState {
	String stateName;
	public abstract void switchCUState(ControlUnit cu); //to switch CU state from Busy to On and then back to Busy.
	
}

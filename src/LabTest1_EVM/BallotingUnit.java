package LabTest1_EVM;
/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */
import java.util.ArrayList;

public class BallotingUnit {
	ArrayList<BallotSlot> slots = new ArrayList<BallotSlot>();
	BUState state;
	
	public void setCandidateSlot(String name){
		BallotSlot bs = new BallotSlot(name);
		slots.add(bs);
	}
	
	public void setState(BUState s) {
		state = s;
	}
	
}

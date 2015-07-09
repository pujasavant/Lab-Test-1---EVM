package LabTest1_EVM;

/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */

import java.util.ArrayList;
import java.util.Iterator;

public class BallotingUnit {
	ArrayList<BallotSlot> slots = new ArrayList<BallotSlot>();
	BUState state;
	
	public void setCandidateSlot(String name){
		BallotSlot bs = new BallotSlot(name);
		slots.add(bs);
	}
	
	public void vote(String candidateName){
		Iterator<BallotSlot> itr = slots.iterator();
		while(itr.hasNext()){
			BallotSlot bs = itr.next();
			if(bs.getCandidateName() == candidateName){
				//vote
			}
		}
	}
	
	public String switchBUState(){
		state.switchBUState(this);
		System.out.println("BU state: "+state);
		return state.stateName;
	}
	
	public String getBUState(){
		return state.stateName;
	}
	
	public void setState(BUState s) {
		state = s;
	}
	
}

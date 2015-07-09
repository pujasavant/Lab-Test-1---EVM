package LabTest1_EVM;
/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 *
 */
public class Candidate {
	String CandidateName;
	int voteCount;
	
	Candidate(String name){
		this.CandidateName = name;
		voteCount = 0;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public String getCandidateName() {
		return CandidateName;
	}
	
}

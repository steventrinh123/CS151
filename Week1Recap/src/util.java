
public class util {
	
public static void printInfo(Candidate person)
{
	System.out.print("ID: " + person.getCandidateId() + "\nName: " + person.getName() + "\nParty: " + person.getParty());
}

public static void printInfo(Voter person)
{
	System.out.print("ID: " + person.getVoterId() + "\nName: " + person.getName() + "\nParty: " + person.getHasVoted());
}
}

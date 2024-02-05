
public class Candidate {
	public final int candidateId;
	public String party;
	public String firstName;
	public String lastName;
	public Candidate(int candidateId, String firstName, String lastName, String party)
	{
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.party = party;
	}
	
	public String getName()
	{
		return firstName.toUpperCase() + " " + lastName.toUpperCase();
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setName(String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	public void setFirst(String first)
	{
		firstName = first;
	}
	public void setLast(String last)
	{
		lastName = last;
	}
	public int getCandidateId()
	{
		return candidateId;
	}
	public String getParty()
	{
		return party;
	}
	
	
public static void main(String[] args)
{
	Candidate person = new Candidate(5, "Tom", "Tim", "Test");
	System.out.println(person.getName());
	util.printInfo(person);
}

}

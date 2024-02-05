
public class Voter {
	public final int voterId;
	public boolean hasVoted;
	public String firstName;
	public String lastName;
	
	public Voter(int voterId, String firstName, String lastName, boolean hasVoted)
	{
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hasVoted = hasVoted;
	}
	
	public int getVoterId()
	{
		return voterId;
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
	public void setFirstName(String first)
	{
		firstName = first;
	}
	public void setLastName(String last)
	{
		lastName = last;
	}
	public boolean getHasVoted()
	{
		return hasVoted;
	}

public static void main(String[] args)
{
	Voter person = new Voter(3, "Bob", "Duncan", true);
	System.out.println(person.getVoterId());
	util.printInfo(person);
}

}
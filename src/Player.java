public class Player
{
	private String character;
	private String name;
	private String twitter;
	private String alt;

	public Player(String n, String t, String c, String a)
	{
		name=n;
		twitter=t;
		character=c;
		alt=a;
	}

	public void setCharacter(String ch)
	{
		character=ch;
	}

	public String getCharacter()
	{
		return this.character;
	}

	public void setName(String n)
	{
		name=n;
	}

	public String getName()
	{
		return this.name;
	}

	public void setTwitter(String twit)
	{
		twitter=twit;
	}

	public String getTwitter()
	{
		return this.twitter;
	}
	
	public void setAlt(String twit)
	{
		alt=twit;
	}

	public String getAlt()
	{
		return this.alt;
	}
}
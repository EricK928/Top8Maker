public class TournamentInfo
{
	private String name;
	private String num;
	private String date;
	private String entrants;
	private String location;
	private String bgPath;
	private String url;

	public TournamentInfo(String name, String n, String d, String e, String l, String b, String u)
	{
		if(n.equals(""))
		{
			num=n;
		}
		else
		{
			num="#"+n;
		}
		
		this.name=name;
		date=d;
		entrants=e;
		location=l;
		bgPath=b;
		url=u;
	}

	public void setNamem(String n)
	{
		name=n;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setNum(String n)
	{
		num=n;
	}

	public String getNum()
	{
		return this.num;
	}

	public void setDate(String d)
	{
		date=d;
	}

	public String getDate()
	{
		return this.date;
	}

	public void setEntrants(String e)
	{
		entrants=e;
	}

	public String getEntrants()
	{
		return this.entrants;
	}
	
	public void setLocation(String l)
	{
		location=l;
	}

	public String getLocation()
	{
		return this.location;
	}
	
	public void setBackground(String b)
	{
		bgPath=b;
	}

	public String getBackground()
	{
		return this.bgPath;
	}
	
	public void setURL(String b)
	{
		url=b;
	}

	public String getURL()
	{
		return this.url;
	}
}
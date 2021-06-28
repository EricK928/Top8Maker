public class Winners
{
	private String melee;
	private String rivals;
	private String doubles;

	public Winners(String m, String r, String d)
	{
		melee=m;
		rivals=r;
		doubles=d;
	}

	public void setMelee(String m)
	{
		melee=m;
	}

	public String getMelee()
	{
		return this.melee;
	}

	public void setRivals(String r)
	{
		rivals=r;
	}

	public String getRivals()
	{
		return this.rivals;
	}

	public void setDoubles(String d)
	{
		doubles=d;
	}

	public String getDoubles()
	{
		return this.doubles;
	}
}
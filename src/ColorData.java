import java.awt.*;

public class ColorData
{
	private Color boarderColor;
	private Color infoTextColor;
	private Color nameTextColor;
	private Color twitterTextColor;
	
	public ColorData (Color board, Color info, Color name, Color twitter)
	{
		boarderColor=board;
		infoTextColor=info;
		nameTextColor=name;
		twitterTextColor=twitter;
	}
	
	public void setBoarderColor(Color c)
	{
		boarderColor=c;
	}
	
	public Color getBoarderColor()
	{
		return this.boarderColor;
	}

	public void setInfoColor(Color c)
	{
		infoTextColor=c;
	}
	
	public Color getInfoColor()
	{
		return this.infoTextColor;
	}

	public void setNameColor(Color c)
	{
		nameTextColor=c;
	}
	
	public Color getNameColor()
	{
		return this.nameTextColor;
	}
	
	public void setTwitterColor(Color c)
	{
		twitterTextColor=c;
	}
	
	public Color getTwitterColor()
	{
		return this.twitterTextColor;
	}
}

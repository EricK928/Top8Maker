
public class ImageLocations 
{
	private String bgPath;
	private String boardPath;
	
	public ImageLocations(String back, String board)
	{
		bgPath=back;
		boardPath=board;
	}
	
	public void setBackground(String b)
	{
		bgPath=b;
	}

	public String getBackground()
	{
		return this.bgPath;
	}
	
	public void setBoarder(String b)
	{
		boardPath=b;
	}

	public String getBoarder()
	{
		return this.boardPath;
	}

}

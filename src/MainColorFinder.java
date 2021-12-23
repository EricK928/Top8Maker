import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MainColorFinder
{
	private String fileLocation=null;
	private BufferedImage image=null;

	public MainColorFinder(String location)
	{
		fileLocation=location;
	}
	
	public MainColorFinder(BufferedImage bi)
	{
		image=bi;
	}

	public Color getMainColor()
	{
		int allReds=0;
		int allGreens=0;
		int allBlues=0;

		File f=null;
		BufferedImage check=null;
		
		if(fileLocation!=null)
		{
			f=new File(fileLocation);
			
			try
			{
				check=ImageIO.read(f);
			}
			catch(IOException e)
			{
			}
		}
		else
		{
			check=image;
		}


		for(int i=0; i<check.getWidth(); i++)
		{
			for(int j=0; j<check.getHeight(); j++)
			{
				int pixelToCheck = check.getRGB(i,j);
				Color pixelColor=new Color(pixelToCheck, true);

				allReds+=pixelColor.getRed();
				allGreens+=pixelColor.getGreen();
				allBlues+=pixelColor.getBlue();
			}
		}

		int pixelAmount=check.getWidth()*check.getHeight();

		allReds/=pixelAmount;
		allBlues/=pixelAmount;
		allGreens/=pixelAmount;

		return new Color(allReds, allGreens, allBlues);
	}

	public Color getMainColorOpposite()
	{
		Color mainColor=getMainColor();
		return new Color(255-mainColor.getRed(),255-mainColor.getGreen(),255-mainColor.getBlue());
	}
}
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import javax.swing.JFileChooser;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class ImageCreator extends Canvas
{
	private TournamentInfo t;
	private ImageLocations i;
	private Player p1, p2, p3, p4, p5, p6, p7, p8;
	private BufferedImage info, bg, c1, c2, c3, c4, c5, c6, c7, c8;
	private Color boarder, infoText, name, twitter;
	private URL bgURL, infoURL, c1URL;

	public ImageCreator(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8, TournamentInfo t, ImageLocations i, ColorData col)
	{
		this.t=t;
		this.i=i;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.p5=p5;
		this.p6=p6;
		this.p7=p7;
		this.p8=p8;
		
		boarder=col.getBoarderColor();
		infoText=col.getInfoColor();
		name=col.getNameColor();
		twitter=col.getTwitterColor();

       try
       {
     	  
     	  if(i.getBackground()==null)
     	  {
     		  bgURL=getClass().getResource("/resources/bg.png");
     		  bg = ImageIO.read(bgURL);
     	  }
     	  else
     	  {
     		 bg = ImageIO.read(new File(i.getBackground()));
     	  }
     	  
     	  infoURL = getClass().getResource("/resources/template.png");
          info=ImageIO.read(infoURL);

     	  c1URL = getClass().getResource("/resources/characters/"+p1.getCharacter()+p1.getAlt()+".png");
          c1=ImageIO.read(c1URL);
           
          URL c2URL = getClass().getResource("/resources/characters/"+p2.getCharacter()+p2.getAlt()+".png");
          c2=ImageIO.read(c2URL);
           
          URL c3URL = getClass().getResource("/resources/characters/"+p3.getCharacter()+p3.getAlt()+".png");
          c3=ImageIO.read(c3URL);
           
          URL c4URL = getClass().getResource("/resources/characters/"+p4.getCharacter()+p4.getAlt()+".png");
          c4=ImageIO.read(c4URL);
           
          URL c5URL = getClass().getResource("/resources/characters/"+p5.getCharacter()+p5.getAlt()+".png");
          c5=ImageIO.read(c5URL);
           
          URL c6URL = getClass().getResource("/resources/characters/"+p6.getCharacter()+p6.getAlt()+".png");
          c6=ImageIO.read(c6URL);
           
          URL c7URL = getClass().getResource("/resources/characters/"+p7.getCharacter()+p7.getAlt()+".png");
          c7=ImageIO.read(c7URL);
           
          URL c8URL = getClass().getResource("/resources/characters/"+p8.getCharacter()+p8.getAlt()+".png");
          c8=ImageIO.read(c8URL);
       }
       catch (IOException ex)
       {
            System.out.println("Image not found!");
       }
	}
	private void drawName(Graphics f, Graphics g, String text, int xval, int yval, int flag, int fontSize, Color c)
	{
		AttributedString a = new AttributedString(text);
		Font name=new Font("Helvetica Rounded", Font.PLAIN, 16);

		g.setFont(new Font("Helvetica Rounded", Font.PLAIN,fontSize));
		f.setFont(new Font("Helvetica Rounded", Font.PLAIN,fontSize));
			
		try 
		{
			a.addAttribute(TextAttribute.FONT, new Font("Helvetica Rounded", Font.PLAIN,fontSize));
			a.addAttribute(TextAttribute.FOREGROUND, c, 0, text.length());
			
			if(flag==2)
			{
				MainColorFinder mc=new MainColorFinder(bg);
				Color op=mc.getMainColorOpposite();
				System.out.println(op);
				
				float red=op.getRed()/255;
				float blue=op.getBlue()/255;
				float green=op.getGreen()/255;
				//a.addAttribute(TextAttribute.BACKGROUND, new Color(red,green,blue,0.5f), 0, text.length());
				
				a.addAttribute(TextAttribute.BACKGROUND, new Color(1.0f,1.0f,1.0f,0.42f), 0, text.length());
			}
		}
		catch(IllegalArgumentException ia) {}
			
		g.drawString(a.getIterator(), xval,yval);
		f.drawString(a.getIterator(), xval,yval);
	
		g.setFont(name);
		f.setFont(name);
	}
	
	public void printNames(Graphics font, Graphics img)
	{
		drawName(font,img,p1.getName(),155,240,0,36,name);
		drawName(font,img,p2.getName(),773,240,0,36,name);
		drawName(font,img,p3.getName(),155,340,0,36,name);
		drawName(font,img,p4.getName(),773,340,0,36,name);
		drawName(font,img,p5.getName(),155,440,0,36,name);
		drawName(font,img,p6.getName(),773,440,0,36,name);
		drawName(font,img,p7.getName(),155,540,0,36,name);
		drawName(font,img,p8.getName(),773,540,0,36,name);
	}
	
	public void printPlacements(Graphics font, Graphics img)
	{
		drawName(font,img,"1st",60,243,0,48,new Color(255,232,34));
		drawName(font,img,"2nd",673,243,0,48,new Color(167,167,167));
		drawName(font,img,"3rd",60,343,0,48,new Color(175,130,25));
		drawName(font,img,"4th",673,343,0,48,Color.BLACK);
		drawName(font,img,"5th",60,443,0,48,Color.BLACK);
		drawName(font,img,"5th",673,443,0,48,Color.BLACK);
		drawName(font,img,"7th",60,543,0,48,Color.BLACK);
		drawName(font,img,"7th",673,543,0,48,Color.BLACK);
	}

	public void printInfoWin(Graphics font, Graphics img)
	{
		String date=t.getDate();
		
		if(!date.equals(""))
		{
			date="     "+date;
		}
		
		String location=t.getLocation();
		
		if(!location.equals(""))
		{
			location="     "+location;
		}

		drawName(font,img,t.getName()+t.getNum(),50,87,2,48,infoText);
		drawName(font,img,"Top 8",50,150,2,48,infoText);
		drawName(font,img,t.getEntrants()+" Entrants"+date+location,50,629,2,32,infoText);
		drawName(font,img,t.getURL(),50,682,2,32,infoText);
	}

	public void printTwitters(Graphics font, Graphics img)
	{
		drawName(font,img,p1.getTwitter(),82,273,0,20,twitter);
		drawName(font,img,p2.getTwitter(),699,273,0,20,twitter);
		drawName(font,img,p3.getTwitter(),82,373,0,20,twitter);
		drawName(font,img,p4.getTwitter(),699,373,0,20,twitter);
		drawName(font,img,p5.getTwitter(),82,473,0,20,twitter);
		drawName(font,img,p6.getTwitter(),699,473,0,20,twitter);
		drawName(font,img,p7.getTwitter(),82,573,0,20,twitter);
		drawName(font,img,p8.getTwitter(),699,573,0,20,twitter);
	}

	public void paint(Graphics font)
	{
		Graphics2D imgG=(Graphics2D)font;
		BufferedImage bi = new BufferedImage(this.getSize().width, this.getSize().height, BufferedImage.TYPE_INT_ARGB);//Graphic final image
		imgG=bi.createGraphics();
		
		Graphics2D fontT =(Graphics2D)font;
		
		Image resizedBG = bg.getScaledInstance(1280, 720, Image.SCALE_SMOOTH);

		fontT.drawImage(resizedBG,0,0,null);
		imgG.drawImage(resizedBG,0,0,null);
		fontT.drawImage(info,0,0,null);
		imgG.drawImage(info,0,0,null);
        
        fontT.setColor(boarder);
        imgG.setColor(boarder);
        
        fontT.fillRect(0, 0, 1280, 20);
        fontT.fillRect(0, 20, 20, 700);
        fontT.fillRect(1260, 20, 20, 685);
        fontT.fillRect(20, 700, 1260, 20);
        
        imgG.fillRect(0, 0, 1280, 20);
        imgG.fillRect(0, 20, 20, 720);
        imgG.fillRect(1260, 20, 20, 685);
        imgG.fillRect(20, 700, 1260, 20);
		
		//Draw info
		printInfoWin(fontT,imgG);
		
		//Draw placements
		printPlacements(fontT,imgG);

		//Drawing player names
		printNames(fontT,imgG);

		//Drawing Twitter handles
		printTwitters(fontT,imgG);
		
		//DRAWING CHARACTERS!!!
		fontT.drawImage(c1,509,199,null);
		fontT.drawImage(c2,1126,199,null);
		fontT.drawImage(c3,509,299,null);
		fontT.drawImage(c4,1126,299,null);
		fontT.drawImage(c5,509,399,null);
		fontT.drawImage(c6,1126,399,null);
		fontT.drawImage(c7,509,499,null);
		fontT.drawImage(c8,1126,499,null);

		imgG.drawImage(c1,509,199,null);
		imgG.drawImage(c2,1126,199,null);
		imgG.drawImage(c3,509,299,null);
		imgG.drawImage(c4,1126,299,null);
		imgG.drawImage(c5,509,399,null);
		imgG.drawImage(c6,1126,399,null);
		imgG.drawImage(c7,509,499,null);
		imgG.drawImage(c8,1126,499,null);
		
		//Updating boarder
   	  	BufferedImage pat=null;
   	  	
		try 
		{
			pat = ImageIO.read(new File(i.getBoarder()));
		} 
		catch (Exception e1) 
		{
		}
   	  	
		int boarderSize=20;
		
		if(pat!=null)
		{
	   	  	Image resized = pat.getScaledInstance(boarderSize, boarderSize, Image.SCALE_SMOOTH);
	   	  	
	        for(int topBar=0; topBar<1280; topBar+=boarderSize)
	        {
	        	imgG.drawImage(resized,0,topBar,null);
	        	imgG.drawImage(resized,topBar,0,null);
	        	fontT.drawImage(resized,0,topBar,null);
	        	fontT.drawImage(resized,topBar,0,null);
	        }
	        
	        for(int botBar=1280; botBar>0; botBar-=boarderSize)
	        {
	        	imgG.drawImage(resized,1260,botBar,null);
	        	imgG.drawImage(resized,botBar,700,null);
	        	fontT.drawImage(resized,1260,botBar,null);
	        	fontT.drawImage(resized,botBar,700,null);
	        }
		}

		//Saving the graphic
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save"); 
		
		int userSelection = fileChooser.showSaveDialog(this);
		 
		if (userSelection == JFileChooser.APPROVE_OPTION) 
		{
		    File fileToSave = new File(fileChooser.getSelectedFile()+".png");
		    try
		    {
		    	ImageIO.write(bi,"png",fileToSave);
		    }
		    catch (Exception e) {}
		    
		    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
		}
	}
}
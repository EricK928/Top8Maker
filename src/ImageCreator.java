import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import javax.swing.JFileChooser;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javafx.*;
public class ImageCreator extends Canvas
{
	private TournamentInfo t;
	//private Winners w;
	private Player p1, p2, p3, p4, p5, p6, p7, p8;
	private BufferedImage info, bg, c1, c2, c3, c4, c5, c6, c7, c8;

	public ImageCreator(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8, TournamentInfo t)
	{
		this.t=t;
		//this.w=w;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.p5=p5;
		this.p6=p6;
		this.p7=p7;
		this.p8=p8;

       try
       {
     	  
     	  if(t.getBackground()==null)
     	  {
     		  URL bgURL=getClass().getResource("/resources/bg.png");
     		  bg = ImageIO.read(bgURL);
     	  }
     	  else
     	  {
     		 bg = ImageIO.read(new File(t.getBackground()));
     	  }
     	  
     	  URL infoURL = getClass().getResource("/resources/template.png");
          info=ImageIO.read(infoURL);

     	  URL c1URL = getClass().getResource("/resources/characters/"+p1.getCharacter()+p1.getAlt()+".png");
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
	private void drawName(Graphics f, Graphics g, String text, int xval, int yval, int flag)
	{
		AttributedString a = new AttributedString(text);
		Font name=new Font("Helvetica Rounded", Font.PLAIN, 16);

		if(flag==2)
		{
			g.setFont(new Font("Helvetica Rounded", Font.PLAIN,48));
			f.setFont(new Font("Helvetica Rounded", Font.PLAIN,48));
			
			try 
			{
				a.addAttribute(TextAttribute.FONT, new Font("Helvetica Rounded", Font.PLAIN,48));
				a.addAttribute(TextAttribute.BACKGROUND, new Color(1.0f,1.0f,1.0f,0.42f), 0, text.length());
			}
			catch(IllegalArgumentException ia) {}
			
			g.drawString(a.getIterator(), xval,yval);
			g.setFont(name);
			
			f.drawString(a.getIterator(), xval,yval);
			f.setFont(name);
		}
		else if(flag==3)
		{
			
			g.setFont(new Font("Helvetica Rounded", Font.PLAIN,32));
			f.setFont(new Font("Helvetica Rounded", Font.PLAIN,32));
			
			try 
			{
				a.addAttribute(TextAttribute.FONT, new Font("Helvetica Rounded", Font.PLAIN,32));
				a.addAttribute(TextAttribute.BACKGROUND, new Color(1.0f,1.0f,1.0f,0.42f), 0, text.length());
			}
			catch(IllegalArgumentException ia) {}
			
			g.drawString(a.getIterator(), xval,yval);
			g.setFont(name);
			
			f.drawString(a.getIterator(), xval,yval);
			f.setFont(name);
		}
		else if(flag==0)
		{

			//g.setFont(new Font("Helvetica Rounded", Font.PLAIN, 48));
			//f.setFont(new Font("Helvetica Rounded", Font.PLAIN, 48));
			try 
			{
				a.addAttribute(TextAttribute.FONT, new Font("Helvetica Rounded", Font.PLAIN,36));
				//a.addAttribute(TextAttribute.BACKGROUND, new Color(1.0f,1.0f,1.0f,0.42f), 0, text.length());
			}
			catch(IllegalArgumentException ia) {}
			
			
			g.drawString(a.getIterator(), xval,yval);
			g.setFont(name);
			
			f.drawString(a.getIterator(), xval,yval);
			f.setFont(name);
		}
	}

	private void drawPlacement(Graphics f, Graphics g, String text, int xval, int yval, Color c)
	{
		AttributedString a = new AttributedString(text);
		Font name=new Font("Helvetica Rounded", Font.PLAIN, 16);


		try 
		{
			a.addAttribute(TextAttribute.FONT, new Font("Helvetica Rounded", Font.PLAIN,48));
			a.addAttribute(TextAttribute.FOREGROUND, c, 0, text.length());
		}
		catch(IllegalArgumentException ia) {}
			
			
		g.drawString(a.getIterator(), xval,yval);
		g.setFont(name);
			
		f.drawString(a.getIterator(), xval,yval);
		f.setFont(name);
	}
	
	public void printNames(Graphics font, Graphics img)
	{
		font.setColor(Color.black);
		img.setColor(Color.black);

		drawName(font,img,p1.getName(),155,240,0);
		drawName(font,img,p2.getName(),773,240,0);
		drawName(font,img,p3.getName(),155,340,0);
		drawName(font,img,p4.getName(),773,340,0);
		drawName(font,img,p5.getName(),155,440,0);
		drawName(font,img,p6.getName(),773,440,0);
		drawName(font,img,p7.getName(),155,540,0);
		drawName(font,img,p8.getName(),773,540,0);
	}
	
	public void printPlacements(Graphics font, Graphics img)
	{
		font.setColor(Color.black);
		img.setColor(Color.black);

		drawPlacement(font,img,"1st",60,243,new Color(255,232,34));
		drawPlacement(font,img,"2nd",673,243,new Color(167,167,167));
		drawPlacement(font,img,"3rd",60,343,new Color(175,130,25));
		drawPlacement(font,img,"4th",673,343,Color.BLACK);
		drawPlacement(font,img,"5th",60,443,Color.BLACK);
		drawPlacement(font,img,"5th",673,443,Color.BLACK);
		drawPlacement(font,img,"7th",60,543,Color.BLACK);
		drawPlacement(font,img,"7th",673,543,Color.BLACK);
	}

	public void printInfoWin(Graphics font, Graphics img)
	{
		font.setColor(Color.black);
		img.setColor(Color.black);

		drawName(font,img,t.getName()+" "+t.getNum(),50,87,2);
		drawName(font,img,"Top 8",50,150,2);
		drawName(font,img,t.getEntrants()+" Entrants     "+t.getDate()+"     "+t.getLocation(),50,629,3);
		drawName(font,img,t.getURL(),50,682,3);
	}

	private void drawTweet(Graphics f, Graphics g, String text, int xval, int yval)
	{
		Font name=new Font("Helvetica Rounded", Font.PLAIN, 12);

		g.setFont(new Font("Helvetica Rounded", Font.PLAIN, 20));
		f.setFont(new Font("Helvetica Rounded", Font.PLAIN, 20));

		g.drawString(text, xval,yval);
		g.setFont(name);
		f.drawString(text, xval,yval);
		f.setFont(name);
	}

	public void printTwitters(Graphics font, Graphics img)
	{
		font.setColor(Color.white);
		img.setColor(Color.white);

		drawTweet(font,img,p1.getTwitter(),82,273);
		drawTweet(font,img,p2.getTwitter(),699,273);
		drawTweet(font,img,p3.getTwitter(),82,373);
		drawTweet(font,img,p4.getTwitter(),699,373);
		drawTweet(font,img,p5.getTwitter(),82,473);
		drawTweet(font,img,p6.getTwitter(),699,473);
		drawTweet(font,img,p7.getTwitter(),82,573);
		drawTweet(font,img,p8.getTwitter(),699,573);
	}

	public void paint(Graphics font)
	{
		Graphics imgG=font;
		BufferedImage bi = new BufferedImage(this.getSize().width, this.getSize().height, BufferedImage.TYPE_INT_ARGB);//Graphic final image
		imgG=bi.createGraphics();
		
		Graphics2D fontT =(Graphics2D)font;

		fontT.drawImage(bg,0,0,null);
		imgG.drawImage(bg,0,0,null);
		fontT.drawImage(info,0,0,null);
		imgG.drawImage(info,0,0,null);
		
		//int value = this.chooseColour(); // used to return how bright the red is needed
		
        /*fontT.setComposite(AlphaComposite.SrcOver.derive(0.2f));
        Color myColour = new Color(255, 0,0 );
        fontT.setColor(myColour);
        fontT.fillRect(0, 0, 1280, 720);
        fontT.setComposite(AlphaComposite.SrcOver.derive(1.0f));*/
		
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

		//this.paint(font);
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
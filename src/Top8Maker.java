// java Program to create a simple JPanel add components to it
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Top8Maker extends JFrame
{
	static String[] characters = {"Mario", "Donkey Kong", "Link", "Samus", "Dark Samus", "Yoshi", "Kirby", "Fox", "Pikachu", "Luigi", "Ness", "Captain Falcon", "Jigglypuff", "Peach", "Daisy", "Bowser", "Ice Climbers", "Sheik", "Zelda", "Doctor Mario", "Pichu", "Falco", "Marth", "Lucina", "Young Link", "Ganondorf", "Mewtwo", "Roy", "Chrom", "Mr. Game & Watch", "Meta Knight", "Pit", "Dark Pit", "Zero Suit Samus", "Wario", "Snake", "Ike", "Pokemon Trainer", "Diddy Kong", "Lucas", "Sonic", "King Dedede", "Olimar", "Lucario", "R.O.B.", "Toon Link", "Wolf", "Villager", "Megaman", "Wii Fit Trainer", "Rosalina & Luma", "Little Mac", "Greninja", "Palutena", "Pac-man", "Robin", "Shulk", "Bowser Jr.", "Duck Hunt", "Ryu", "Ken", "Cloud", "Corrin", "Bayonetta", "Inkling", "Ridley", "Simon", "Richter", "King K. Rool", "Isabelle", "Incineroar", "Piranha Plant", "Joker", "Hero", "Banjo & Kazooie", "Terry", "Byleth", "Min-Min", "Steve", "Sephiroth", "Pyra", "Mythra", "Kazuya", "Sora", "Mii Brawler", "Mii Swordfighter", "Mii Gunner"};// 
	static String[] alts = {"1","2","3","4","5","6","7","8"};
	static String bgLocation, boardLocation=null;
    //JFrame
    static JFrame f, colorPick;

    //JButton
    static JButton gen, bgSelect, boardSelect, colorSelect;
    
    static JColorChooser boarder;

    //JFileChooser
    static JFileChooser bgSelector, boardSelector;

    //JLabels
    static JLabel tournamentName, tournamentNum, tournamentDate, numEntrants, tournamentLoc, tournamentUrl, p1name, p1character, p1twitter, p2name, p2character, p2twitter, p3name, p3character, p3twitter, p4name, p4character, p4twitter, p5name, p5character, p5twitter, p6name, p6character, p6twitter, p7name, p7character, p7twitter, p8name, p8character, p8twitter;

    //JTextFields
    static JTextField tName, tNum, tDate, tLoc, entrantNum, tUrl, rWin, dWin, p1NameIn, p1TwitterIn, p2NameIn, p2TwitterIn, p3NameIn, p3TwitterIn, p4NameIn, p4TwitterIn, p5NameIn, p5TwitterIn, p6NameIn, p6TwitterIn, p7NameIn, p7TwitterIn, p8NameIn, p8TwitterIn;

    //JComboBoxes
    static JComboBox<String> p1char, p2char, p3char, p4char, p5char, p6char, p7char, p8char, p1alt, p2alt, p3alt, p4alt, p5alt, p6alt, p7alt, p8alt;

    public static void main(String[] args)
    {
        //Creates the JFrame
        f = new JFrame("Set specifications");

        JLabel blank=new JLabel("  ");
        
        JLabel altText1=new JLabel(" Alt:");
        JLabel altText2=new JLabel(" Alt:");
        JLabel altText3=new JLabel(" Alt:");
        JLabel altText4=new JLabel(" Alt:");
        JLabel altText5=new JLabel(" Alt:");
        JLabel altText6=new JLabel(" Alt:");
        JLabel altText7=new JLabel(" Alt:");
        JLabel altText8=new JLabel(" Alt:");

        //Create the labels
        p1name=new JLabel("1st place name: ");
        p1twitter=new JLabel("1st place Twitter: ");
        p1character=new JLabel("1st place character: ");

        p2name=new JLabel("2nd place name: ");
		p2twitter=new JLabel("2nd place Twitter: ");
        p2character=new JLabel("2nd place character: ");

        p3name=new JLabel("3rd place name: ");
		p3twitter=new JLabel("3rd place Twitter: ");
        p3character=new JLabel("3rd place character: ");

        p4name=new JLabel("4th place name: ");
		p4twitter=new JLabel("4th place Twitter: ");
        p4character=new JLabel("4th place character: ");

        p5name=new JLabel("5th place name: ");
		p5twitter=new JLabel("5th place Twitter: ");
        p5character=new JLabel("5th place character: ");

        p6name=new JLabel("5th place name: ");
		p6twitter=new JLabel("5th place Twitter: ");
        p6character=new JLabel("5th place character: ");

        p7name=new JLabel("7th place name: ");
		p7twitter=new JLabel("7th place Twitter: ");
        p7character=new JLabel("7th place character: ");

        p8name=new JLabel("7th place name: ");
		p8twitter=new JLabel("7th place Twitter: ");
        p8character=new JLabel("7th place character: ");

        tournamentName=new JLabel("Tournament name: ");
        tournamentNum=new JLabel("Tournament #: ");
        tournamentDate=new JLabel("Date of tournament: ");
        tournamentLoc=new JLabel("Tournament locale: ");
        numEntrants=new JLabel("# of Entrants: ");
        tournamentUrl=new JLabel("Tournament link: ");

        //Creating input fields
        p1NameIn=new JTextField(20);
        p1TwitterIn=new JTextField(20);

        p2NameIn=new JTextField(20);
        p2TwitterIn=new JTextField(20);

        p3NameIn=new JTextField(20);
        p3TwitterIn=new JTextField(20);

        p4NameIn=new JTextField(20);
        p4TwitterIn=new JTextField(20);

        p5NameIn=new JTextField(20);
        p5TwitterIn=new JTextField(20);

        p6NameIn=new JTextField(20);
        p6TwitterIn=new JTextField(20);

        p7NameIn=new JTextField(20);
        p7TwitterIn=new JTextField(20);

        p8NameIn=new JTextField(20);
        p8TwitterIn=new JTextField(20);

        tName=new JTextField(20);
        tNum=new JTextField(20);
        tDate=new JTextField(20);
        tLoc=new JTextField(20);
        entrantNum=new JTextField(20);
        tUrl=new JTextField(20);
        
        boarder=new JColorChooser(new Color(0,0,0));


        //Create the buttons
        gen = new JButton("Generate graphic");
		gen.addActionListener(new ActionListener()
		{

		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
				Player p1=new Player(p1NameIn.getText(),p1TwitterIn.getText(),(String)p1char.getSelectedItem(),(String)p1alt.getSelectedItem());
				Player p2=new Player(p2NameIn.getText(),p2TwitterIn.getText(),(String)p2char.getSelectedItem(),(String)p2alt.getSelectedItem());
				Player p3=new Player(p3NameIn.getText(),p3TwitterIn.getText(),(String)p3char.getSelectedItem(),(String)p3alt.getSelectedItem());
				Player p4=new Player(p4NameIn.getText(),p4TwitterIn.getText(),(String)p4char.getSelectedItem(),(String)p4alt.getSelectedItem());
				Player p5=new Player(p5NameIn.getText(),p5TwitterIn.getText(),(String)p5char.getSelectedItem(),(String)p5alt.getSelectedItem());
				Player p6=new Player(p6NameIn.getText(),p6TwitterIn.getText(),(String)p6char.getSelectedItem(),(String)p6alt.getSelectedItem());
				Player p7=new Player(p7NameIn.getText(),p7TwitterIn.getText(),(String)p7char.getSelectedItem(),(String)p7alt.getSelectedItem());
				Player p8=new Player(p8NameIn.getText(),p8TwitterIn.getText(),(String)p8char.getSelectedItem(),(String)p8alt.getSelectedItem());
				
				System.out.println();
				
				TournamentInfo ti=new TournamentInfo(tName.getText(), tNum.getText(), tDate.getText(), entrantNum.getText(), tLoc.getText(), tUrl.getText());
				ImageLocations il=new ImageLocations(bgLocation, boardLocation);
				ColorData cd=new ColorData(boarder.getColor(), Color.BLACK, Color.BLACK, Color.WHITE);

				JFrame img=new JFrame("Top 8 Graphic");
				img.setSize(1296, 759);
        		img.add(new ImageCreator(p1, p2, p3, p4, p5, p6, p7, p8, ti, il, cd));
				img.setVisible(true);
		    }
		});

		boardSelect = new JButton("Select boarder");
		boardSelect.addActionListener(new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent b)
		    {
		    	boardSelector = new JFileChooser();
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
		        boardSelector.setFileFilter(filter);
		        int returnVal = boardSelector.showOpenDialog(null);
		        if(returnVal == JFileChooser.APPROVE_OPTION)
		        {
		        	boardLocation=boardSelector.getSelectedFile().getPath();
		            //System.out.println("You chose to open this file: " +boardSelector.getSelectedFile().getPath());
		        }

		    }
		});
		
		bgSelect = new JButton("Select background");
		bgSelect.addActionListener(new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent b)
		    {
		    	bgSelector = new JFileChooser();
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
		        bgSelector.setFileFilter(filter);
		        int returnVal = bgSelector.showOpenDialog(null);
		        if(returnVal == JFileChooser.APPROVE_OPTION)
		        {
		        	bgLocation=bgSelector.getSelectedFile().getPath();
		            System.out.println("You chose to open this file: " +bgSelector.getSelectedFile().getPath());
		        }

		    }
		});
		
		colorSelect = new JButton("Select boarder Color");
		colorSelect.addActionListener(new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent b)
		    {
				JFrame color=new JFrame("Color picker");
				color.add(boarder);
				color.setSize(700, 500);
        		//img.add(new ImageCreator(p1, p2, p3, p4, p5, p6, p7, p8, ti));
				color.setVisible(true);
				//color.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    }
		});

        //Setting up the character selectors
        p1char = new JComboBox<String>(characters);
        p2char = new JComboBox<String>(characters);
        p3char = new JComboBox<String>(characters);
        p4char = new JComboBox<String>(characters);
        p5char = new JComboBox<String>(characters);
        p6char = new JComboBox<String>(characters);
        p7char = new JComboBox<String>(characters);
        p8char = new JComboBox<String>(characters);

        p1alt = new JComboBox<String>(alts);
        p2alt = new JComboBox<String>(alts);
        p3alt = new JComboBox<String>(alts);
        p4alt = new JComboBox<String>(alts);
        p5alt = new JComboBox<String>(alts);
        p6alt = new JComboBox<String>(alts);
        p7alt = new JComboBox<String>(alts);
        p8alt = new JComboBox<String>(alts);

        //Panel to hold everything
        JPanel p = new JPanel();

        //Adding Everything
        
        p.add(tournamentName);
        p.add(tName);
        p.add(tournamentNum);
        p.add(tNum);
        p.add(tournamentDate);
        p.add(tDate);
        p.add(tournamentLoc);
        p.add(tLoc);
        p.add(numEntrants);
        p.add(entrantNum);
        p.add(tournamentUrl);
        p.add(tUrl);

        p.add(p1name);
        p.add(p1NameIn);
        p.add(p1twitter);
        p.add(p1TwitterIn);
        p.add(p1character);
        p.add(p1char);
        p.add(altText1);
        p.add(p1alt);
        
        p.add(p2name);
        p.add(p2NameIn);
        p.add(p2twitter);
        p.add(p2TwitterIn);
        p.add(p2character);
        p.add(p2char);
        p.add(altText2);
        p.add(p2alt);

        p.add(p3name);
        p.add(p3NameIn);
        p.add(p3twitter);
        p.add(p3TwitterIn);
        p.add(p3character);
        p.add(p3char);
        p.add(altText3);
        p.add(p3alt);

        p.add(p4name);
        p.add(p4NameIn);
        p.add(p4twitter);
        p.add(p4TwitterIn);
        p.add(p4character);
        p.add(p4char);
        p.add(altText4);
        p.add(p4alt);


        p.add(p5name);
        p.add(p5NameIn);
        p.add(p5twitter);
        p.add(p5TwitterIn);
        p.add(p5character);
        p.add(p5char);
        p.add(altText5);
        p.add(p5alt);
        
        p.add(p6name);
        p.add(p6NameIn);
        p.add(p6twitter);
        p.add(p6TwitterIn);
        p.add(p6character);
        p.add(p6char);
        p.add(altText6);
        p.add(p6alt);
        
        p.add(p7name);
        p.add(p7NameIn);
        p.add(p7twitter);
        p.add(p7TwitterIn);
        p.add(p7character);
        p.add(p7char);
        p.add(altText7);
        p.add(p7alt);

        p.add(p8name);
        p.add(p8NameIn);
        p.add(p8twitter);
        p.add(p8TwitterIn);
        p.add(p8character);
        p.add(p8char);
        p.add(altText8);
        p.add(p8alt);
        
		p.add(blank);

		p.add(colorSelect);
		p.add(boardSelect);
        p.add(bgSelect);
        p.add(gen);

        //Set background of panel
        p.setBackground(Color.white);

        //Adds panel to frame
        f.add(p);

        //Set frame specs
        f.setSize(365, 900);
        f.setResizable(false);

        f.show();
    }
}
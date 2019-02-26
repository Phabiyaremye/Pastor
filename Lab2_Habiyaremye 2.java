/* 
* Program Name: Lab2
*
* Student Name: (Pamphile Habiyaremye)
* Semester: Spring 2019
* Class & Section: COSC 10403-055
* Instructor: Dr. Bo Mei
* Due Date: Feb 21, 2019
*
* Program Overview:
*     This program creates a  window with one JTextArea, 3 JLists, JComboBox,
*     2RadioButtons, one JCheckBox, and 2 JButtons. 
* Input:
*     There is no user input to this program.
*     
* Program Limitations:
*     The buttons are inactive. 
* Significant Program Variables:
*      sndchListModel1 -- Sandwiches
*      drnksListModel2-- Drinks
*      sidesListModel3-- Sides
*/
import java.awt.*;
import javax.swing.*;

public class Lab2 extends JFrame {
	
	// Naming data
	
	JLabel myLabel;
	ImageIcon myImage;
	JTextArea myTextArea;
	DefaultListModel<String> sndchListModel1, drnksListModel2, sidesListModel3;
	JList<String> sndchList1, drnksList2, sidesList3;
	JComboBox<String> myComboBox;
	JCheckBox myCheckBox;
	JRadioButton radioButton1, radioButton2; 
	JButton myButton, myButton2;
	ButtonGroup myButtonGroup;

	// connect this program to the computer

	public static void main(String args[]) {
		new Lab2();
	}

	//naming components
	
	public Lab2() {
		setSize(800, 800);
		setTitle("Schnellwich");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//creating data
		
		myImage = new ImageIcon("Delicious Food.png");
		myLabel = new JLabel(myImage);
		add(myLabel);
		
		sndchListModel1 = new DefaultListModel<String>();
		sndchList1 = new JList<String>(myListModel1);
		add(myList1);
		
		drinksListModel2 = new DefaultListModel<String>();
		drinksList2 = new JList<String>(myListModel2);
		add(myList2);
		
		sidesListModel3 = new DefaultListModel<String>();
		sidesList3 = new JList<String>(myListModel3);
		add(myList3);
		
		addElements();
		
		myComboBox = new JComboBox<String>();
		add(myComboBox);
		addItems();
	
		myTextArea = new JTextArea(" Small =$5.5, "+ "Medium = $7.00, " + "Large =$8.5, "+" Extra-Large=$9.50, " , 2, 8);
		add(myTextArea);

		myButton = new JButton("Ordering");
		myButton2 = new JButton("Canceling");
		
		add(myButton);
		add(myButton2);
		
		
		add(myButton);

		radioButton1 = new JRadioButton("Fried");
		radioButton2 = new JRadioButton("Grilled");

		add(radioButton1);
		add(radioButton2);

		myCheckBox = new JCheckBox("Sound effect", true);
		add(myCheckBox);
		
		myButtonGroup = new ButtonGroup();
		myButtonGroup.add(radioButton1);
		myButtonGroup.add(radioButton2);
		
   //showing the window
		
		setVisible(true);
	} 
	
	//creating methods. methods
	
	public void addElements() {
		
		sndchListModel1.addElement("Humburger");
		sndchListModel1.addElement("CheeseSteak");
		sndchListModel1.addElement("French dip");
		sndchListModel1.addElement("Torta");
		
		drnksListModel2.addElement("Apple Juice");
		drnksListModel2.addElement("Coffee");
		drnksListModel2.addElement("Tea");
		drnksListModel2.addElement("milk");
		
		sidesListModel3.addElement("Cabbages");
		sidesListModel3.addElement("Brocolli");
	    sidesListModel3.addElement("Baked beans");
		sidesListModel3.addElement("Asparagus");
	}
	
	public void addItems() {
		myComboBox.addItem("small");
		myComboBox.addItem("Medium");
		myComboBox.addItem("Large");
		myComboBox.addItem("Extra-Large");
	}

}

/* 
* Program Name: Lab1
*
* Student Name: (Pamphile Habiyaremye)
* Semester: Spring 2019
* Class & Section: COSC 10403-055
* Instructor: Dr. Bo Mei
* Due Date: Feb 5, 2019
*
* Program Overview:
*     This program creates a simple window with one label and
*     two buttons.
* 
* Input:
*     There is no user input to this program.
*     
* Output:
*     A Window with 1 label and 2 buttons
*     
* Program Limitations:
*     The buttons are inactive. 
* Significant Program Variables:
*      Variable1 -- meaning of this variable.
*      variable2 --meaning of this variable.
*/

import java.awt.*;
import javax.swing.*;

public class Lab1 extends JFrame {
	JLabel myLabel;
	JButton myButton1;
	JButton myButton;
	
	//Connect this program to the computer
public static void main (String args []) {
	new Lab1 ();
}
	
public Lab1 () {
	//Setup a window
	setSize (300, 100);
	setTitle ("Pop-Up Window");
	setLayout (new FlowLayout ());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Setup component names.
	myButton1 = new JButton ("Start");
	add(myButton1);
	myLabel = new JLabel ("Two-Button Frame");
	add (myLabel);
	myButton = new JButton ("Halt");
	add (myButton);
	
	//Show a window.
	setVisible(true);
	
}

	
}

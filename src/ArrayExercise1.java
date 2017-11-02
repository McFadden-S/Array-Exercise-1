/********************************************************************
 * Programmer:	McFadden
 * Class:       CS30S
 *
 * Assignment:      Array Exercise 1
 * Program Name:    Array Exercise 1
 *
 * Description: Will prompt the user to enter 5 numbers into an array. The 
                program will then print out the numbers in their original order, 
                and in reverse order
 *
 * Input:  User will chose how many numbers will be inputted and then input 
 *         that amount of numbers
 *
 * Output: Will out put in original order and reverse order
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class ArrayExercise1 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        final int MAX = 20;             //constant for max range of array
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        int[] inNum = new int[MAX];     //array for inputted number
        int inAmount = 5;               //amount of numbers to be inputted
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		McFadden");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	Array Exercise 1");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		McFadden\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	Array Exercise 1\n";
    	bannerOut += "*******************************************\n\n";
    	
    	fout.println("*******************************************");
    	fout.println("Name:		McFadden");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	Array Exercise 1");
    	fout.println("*******************************************");
 	    	
    // ************************ get input **********************
        
        inAmount = Integer.parseInt(JOptionPane.showInputDialog
            ("Please enter the amount of numbers you would like to enter\nMAX: 20")); 
        
        for (int i = 0; i < inAmount; i++){
            
            inNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number")); 
            
        }//end of for loop
    	

    // ************************ processing ***************************
    
    // ************************ print output ****************************
        
        System.out.print("Numbers in Original Order: ");
        fout.print("Numbers in Original Order: ");
        
        for (int i = 0; i < inAmount; i++){
            
            System.out.print(inNum[i] + ", ");
            fout.print(inNum[i] + ", ");
            
        }//end of for loop
        
        System.out.print("\nNumbers in Reverse Order: ");
        fout.println("");
        fout.print("Numbers in Reverse Order: ");
        
        for (int i = inAmount - 1; i >= 0; i--){
            
            System.out.print(inNum[i] + ", ");
            fout.print(inNum[i] + ", ");
            
        }//end of for loop
    
        // ******** closing message *********
        
        System.out.println("\n\nend of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class

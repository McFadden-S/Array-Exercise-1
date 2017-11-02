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
        final int OFFSET = 1;           //constant for 1 v 0 counting difference
        final int ENDVAL = -1;          //cnstant fo value to end indexing
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        int[] inNum = new int[MAX];     //array for inputted number
        int inAmount = 5;               //amount of numbers to be inputted
        
        boolean check = false;          //variable that turns true when person inputs -1
        int inIndex;                    //variable for which number in array to index
        String YorN;                    //variable for yes or no
        
        int min;                        //variable for min in the array
        int max;                        //variable for max in the array
    	
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
        
        while (check == false){
            
            inIndex = Integer.parseInt(JOptionPane.showInputDialog
               ("Please enter which number in the array you would like to see."
                       + "\ni.e. 1 would be first number in array"));
            check = inIndex == ENDVAL;
            inIndex = inIndex - OFFSET;
            if (check == false){
                System.out.print("\nYour Number is: " + inNum[inIndex]);
                
                YorN = JOptionPane.showInputDialog("Would you like to change the number"
                        + "\nType Yes or No");
                
                if (YorN.equals("Yes")){
                    
                    inNum[inIndex] = Integer.parseInt(JOptionPane.showInputDialog("What would ou like to change it too"));
                    System.out.println("\nYour New Number is: " + inNum[inIndex]);
                    
                }//end of if 
                
            }
        }//end of while loop
        
            min = inNum[0]; //  assume first elements as smallest number
	    max = inNum[0]; //  assume first elements as largest number

		for (int i = 0; i < inAmount; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (inNum[i] > max) //checks if number is greater
			{
				max = inNum[i]; //if its greater assignes it
			}//end of if loop
			if (inNum[i] < min) //checks if number is lesser
			{
				min = inNum[i]; //if its lesser assignes it
			} //end of if loop
		}//end of for loop
                
                System.out.println("The Max Number of the Array is: " + max);
                System.out.println("The Minimum Number of the Array is: " + min);
    
        // ******** closing message *********
        
        System.out.println("\n\nend of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class

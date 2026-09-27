/*--------------------------------------------
    Program 2: MPLS Dog Boarding Cost Estimate
    The MPLS Dog Boarding Company in North Minneapolis is a dog day care facility that is 
    looking for a developer that will implement functionality that will determine the cost 
    of boarding fee based on information entered by client. The application will ask for the 
    name, breed, age, the number of days the dog will need care, and weight of the dog. Once 
    all information is received, the application will generate a estimate that provides the 
    estimated cost of stay, the dog's name, age, number or days, weight and boarding group.  
    The boarding group is based on the dog's age.

    
	
	There will be five requirements for Program 1
	Requirement 1 - Variables are properly declared and initialized; Use of Scanner Object to read 
                    input from console. Make use of constant final variables. When possible, make 
                    sure to declare all variables that will hold data
                    
	Requirement 2 - Input/Output of all necessary information; Correct calculation including 2% discount.
                    
    Requirement 3 - Proper structures used to determine calculated outcome and dog's boarding group; Correct Operators
    Requirement 4 - Style - Proper use of comments, spacing, in program; use of
                    descriptive variable names
    Requirement 5 - Program is submitted by the due date listed and pushed to assigned GitHub Repository; 
                    Repository contains a minimum of three commits.
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring 1 2023
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/

//IMPORT STATEMENTS


public class CostCalc {
    public static void main(String[] args) throws Exception {
       import java.util.Scanner;
public class CostCalc {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        final String name;
        final String breed;
        final int days;
        final int age;
        final int weight;
        final Double discount = 0.02;
        int costperday = 0;
        String boardinggroup = "";

        //WELCOME MESSAGE 
        System.out.println("Welcome to MPLS Dog Boarding cost calculator, this application will generate a summary of cost. ");

        //OUTPUT + INPUT OF DOG INFORMATION
        System.out.print("Enter dog name: ");
        name = input.nextLine();
        System.out.print("Enter dog breed: ");
        breed = input.nextLine();
        System.out.print("Enter the number of days, you dog will be in case: ");
        days = Integer.parseInt(input.nextLine());
        System.out.print("Enter dog age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Enter dog weight in pounds: ");
        weight = Integer.parseInt(input.nextLine());

        input.close();


        if(weight < 15){
            costperday = 45;
        }
        else if(weight >= 15 && weight <= 30){
            costperday = 65; 
        }
        else if(weight > 31 && weight <= 80){
            costperday = 85;
        }
        else if (weight > 80){
            costperday = 100;
        }

        if(age == 0) boardinggroup = "BLUE";
        else if(age > 0 && age <= 4) boardinggroup = "ORANGE";
        else if(age == 5) boardinggroup = "RED";
        else if(age > 5 && age <= 15) boardinggroup = "GREEN";
    
        //DETERMINE DOGS BOARDING GROUP BASED ON AGE
        System.out.println("\nBoarding group is " + boardinggroup);
        System.out.println("Cost per day is $" + costperday + " for " + days + " days.");
        
        double bill = costperday * days;
        if(bill > 165){
            bill = bill - (bill * discount);
        }
        System.out.println("You receive a discount of " + (discount * 100) + "% for exceeding $165.");
        System.out.println("Your total estimated cost is $" + bill);

        /* 
        //DECLARATIONS 
        
        //INSTANTIATE SCANNER OBJECT    

        //DETERMINE ESTIMATED COST BASED ON WEIGHT AND NUMBER OF DAYS
        // Cost per day is $65 for 5 days 

        //DETERMINE IF ESTIMATED COST RECEIVE A DISCOUNT
        // You receieve a discount of 2.0% for excedding $165
        //OUTUT SUMMARY OF DOG INFO. AND ESTIMATED COST
        // Your total estimated cost is $318.5

        */
    }
    
}

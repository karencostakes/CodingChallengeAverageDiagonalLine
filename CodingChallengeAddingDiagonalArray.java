import java.util.Scanner;

public class CodingChallengeAddingDiagonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan1 = new Scanner (System.in)	;
	int [][] userNumbers = new int [3][3];
	for (int i=0; i<3; i++) 
    {System.out.println("Please enter number for the array.");
    userNumbers [i][0] = scan1.nextInt();
    		scan1.nextLine();
    }
	for (int j=0; j<3; j++)
	{System.out.println("Please enter a number for the array.");
	userNumbers [j][1] = scan1.nextInt();
	scan1.nextLine();
	}
	for (int k=0; k<3; k++)
	{System.out.println("Please enter a number for the array");
	userNumbers [k][2] = scan1.nextInt();
	scan1.nextLine();
	}
	System.out.println("The average number of the diagonal of the array you created is: " + (userNumbers[0][0] + userNumbers[1][1] + userNumbers[2][2])/3);
	
	
	}

}

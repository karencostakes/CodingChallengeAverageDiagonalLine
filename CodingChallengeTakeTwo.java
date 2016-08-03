import java.util.Scanner;

public class CodingChallengeTakeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan1 = new Scanner (System.in)	;
	System.out.println("How many boxes should each row/column contain?");
	int sizeOfBox = scan1.nextInt();
	int counter1 = 0;
	int counter2;
	int counter3;
	int sumDiagonal=0;
	scan1.nextLine();
	int [][] userNumbers = new int [sizeOfBox][sizeOfBox];
	
	while(counter1 < sizeOfBox)
	{for (counter2 = 0; counter2<sizeOfBox; counter2++)
	{System.out.println("Please enter a number for the array: ");
    userNumbers [counter1][counter2] = scan1.nextInt();
	scan1.nextLine();
	//System.out.println(userNumbers[counter1][counter2]);
	
	}
	counter1 = counter1 + 1;
	}
	for (counter3 = 0; counter3 < sizeOfBox; counter3++)
	{
		sumDiagonal += userNumbers[counter3][counter3] ;
		
	}
	//System.out.println("test");
	//System.out.println(sumDiagonal);
	//System.out.println(sizeOfBox);
	System.out.println("The average of the diagonal is: " + sumDiagonal/sizeOfBox);
	}
	
	}

	
	
	
	
	
		
		
		
		
	
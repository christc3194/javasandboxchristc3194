import java.util.Scanner;

public class MyPillowIsAwesome {
	public static void main(String[] args) {
		// find all seats in the movie theater!
		int numRows;
		int currRow;
		
		int numColumns;
		int currColumn;
		char columnLetter;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter number of rows: ");
		numRows = scnr.nextInt();
		System.out.print("\n");
		System.out.print("Please enter number of columns: ");
		numColumns = scnr.nextInt();
		System.out.print("\n");
		
		System.out.print("All seats in the movie theatre: ");
		
		for (currRow = 1; currRow <= numRows; ++currRow) {
			columnLetter = 'A';
			for (currColumn = 1; currColumn <= numColumns; ++currColumn) {
				System.out.print(currRow + "" + columnLetter + "" + " ");
				++currColumn;
			}
			++currRow;
		}
		System.out.print("\n");
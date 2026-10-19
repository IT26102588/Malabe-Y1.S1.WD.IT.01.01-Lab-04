import java.util.Scanner;

public class IT26102588Lab4Q2{
	
	public static void main(String[] args){
		
		double examMarks , labMarks , examPercentage , labPercentage , finalMark;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		if (examMarks < 0 || 100 < examMarks){
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		System.out.print("Please enter lab subbmission marks (out of 100): ");
		labMarks = input.nextDouble();
		
		if (labMarks < 0 || 100 < labMarks){
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab subbmission: ");
		labPercentage = input.nextDouble();
		
		if (labPercentage + examPercentage != 100){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100); 
		
		System.out.println();
		System.out.println("Final exam mark is: " + finalMark);
	}
				
}
	

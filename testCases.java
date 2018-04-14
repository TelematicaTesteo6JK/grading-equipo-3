import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testCases {

	public static void main(String[] args) {
		
		function doTest = new function();
		
		String fileName = "report.txt";
		try {
			PrintWriter outputStream = new PrintWriter(fileName);
			outputStream.println("|~~~~~~~~~~~~~~~~~~~~~~~~ Australian Grading Scale ~~~~~~~~~~~~~~~~~~~~~~~~~|"); //The data is stored in RAM first
			outputStream.println("");
			outputStream.println("|~~~~Equivalence Partitioning:");
			outputStream.println("");
			
			int introducedE[] = { -18, 25, 52, 68, 77, 89, 274};
			String expectedE[] = {"Error", "N", "P", "C", "D", "HD", "Error"};
			String resultE[] = new String [7];
			String showResE[] = new String [7];
			
			outputStream.print("      Test data: ");
			for (int i = 0; i<7; i++) {
				outputStream.print(introducedE[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("Expected Result: ");
			for (int i = 0; i<7; i++) {
				outputStream.print(expectedE[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("  Actual Result: ");
			for (int i = 0; i<7; i++) {
				resultE[i] = doTest.testCases(introducedE[i]);
				outputStream.print(resultE[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("      Pass/Fail: ");
			for (int i = 0; i<7; i++) {
				if(expectedE[i] == resultE[i]){
					showResE[i] = "Pass";
				}
				else
				showResE[i] = "Fail";
				
				outputStream.print(showResE[i] + " ");
			}
			outputStream.println("");
			outputStream.println("");
			
			outputStream.println("|~~~~Boundary Value Analisys:");
			outputStream.println("");
			
			double introducedB[] = { -0.01, 0, 49.99, 50, 62.99, 63, 72.99, 73, 82.99, 83, 100, 100.01};
			String expectedB[] = {"Error", "N", "N", "P", "P", "C", "C", "D", "D", "HD", "HD", "Error"};
			String resultB[] = new String [12];
			String showResB[] = new String [12];
			
			outputStream.print("      Test data: ");
			for (int i = 0; i<introducedB.length; i++) {
				outputStream.print(introducedB[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("Expected Result: ");
			for (int i = 0; i<introducedB.length; i++) {
				outputStream.print(expectedB[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("  Actual Result: ");
			for (int i = 0; i<introducedB.length; i++) {
				resultB[i] = doTest.testCases(introducedB[i]);
				outputStream.print(resultB[i] + " ");
			}
			outputStream.println("");
			
			outputStream.print("      Pass/Fail: ");
			for (int i = 0; i<introducedB.length; i++) {
				if(expectedB[i] == resultB[i]){
					showResB[i] = "Pass";
				}
				else
				showResB[i] = "Fail";
				
				outputStream.print(showResB[i] + " ");
			}
			outputStream.println("");
			outputStream.println("");
			
			outputStream.close(); //It flushes the data in RAM to the file	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

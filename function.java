
public class function {
	
	public String testCases(double numb) {
		String grade = "";
		if (numb >=0 && numb <=49.99 ) 
			grade = "N";
		else if(numb >= 50 && numb <= 62.99)
			grade = "P";
		else if(numb >= 63 && numb <= 72.99)
			grade = "C";
		else if(numb >= 73 && numb <= 82.99)
			grade = "D";
		else if (numb >= 83 && numb <= 100)
			grade = "HD";
		else
			grade = "Error";
		return grade;
	}
}
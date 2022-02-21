package ca.lambton.c0774071_Exam;

public class ExamQuestions {

	public static String myPattern = "";
	
	public static String recursionPattern(int n) {
        if (n != 0) {
            String pattern = "*";
            myPattern = myPattern + pattern.repeat(n) + "\n";
            recursionPattern(n-1);
        }
        return myPattern;
    }

}

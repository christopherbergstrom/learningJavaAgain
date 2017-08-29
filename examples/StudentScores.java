package examples;

public class StudentScores
{
	public static void main(String[]args)
	{
		float score1 = 82;
		float score2 = 96;
		float score3 = 35;
		float score4 = 68;
		float average = (score1+score2+score3+score4)/4.0f;
		System.out.println("Score 1: "+score1+"\nScore 2: "+score2+"\nScore 3: "+score3+"\nScore 4: "+score4);
		System.out.println("Average score: "+average);
	}
}
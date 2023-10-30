package codsoft_project;

	import java.util.Scanner;

	public class studentgrade {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of Subjects:");
			int numsubjects = sc.nextInt();
			int[] marks =new int[numsubjects];
			int totalmarks = 0;
			for(int i=0;i<numsubjects;i++)
			{
			System.out.println("Enter marks obtained in each subjects  "+(i+1) +"  :");	
			marks[i]= sc.nextInt();
			totalmarks += marks[i];
			}
			double averagePercentage = (double) totalmarks/(numsubjects*100)*100;
			System.out.println("result");
			System.out.println(" total marks:"+ totalmarks);
			System.out.println("average Percentage: "+ averagePercentage + "%");
			String grade = calculateGrade(averagePercentage);
			System.out.println("Grade:" + grade);
			sc.close();
		}

		public static String calculateGrade(double Percentage)
		{
			
			if (Percentage>=92)
			{
			return "A+";
		}
			else if
			(Percentage>=85)
			{
			return "A";
		}
			else if
			(Percentage>=75)
			{
			return "B";
		}
			else if 
			(Percentage>=65)
			{
			return "c";
		}
			else if 
			(Percentage>=55)
			{
			return "D";
		}
			else
			{
			return "F";
		}
		}


	}



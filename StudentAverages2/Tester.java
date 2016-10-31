
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {
		Scanner fileTaker=new Scanner(new File("E:\\StudenAverages1\\StudentScores.txt"));
		
		int aa=-1;
		String xyz[]=new String[1000];
		while (fileTaker.hasNext())
		{
			aa++;
			xyz[aa]=fileTaker.nextLine();
		}
		fileTaker.close();
		String total="";
		int sum=0;
		int average=0;
		FileWriter fw=new FileWriter("E:\\StudentAverages2\\StudentScores2.in");
		PrintWriter output=new PrintWriter(fw); 
		for (int i=0;i<aa+1;i++)
		{
			Scanner intArray=new Scanner(xyz[i]);
			String name=intArray.next();
			sum=0;
			average=0;
				
			while (intArray.hasNextInt())
			{
				average +=intArray.nextInt();
				sum++;
				//System.out.println(name+": "+ (average/sum));
				//if (!intArray.hasNextInt())
				output.println(name+ ": "+ (average/sum));
					//System.out.println(average/sum);
				
			
			}
		output.close();
		fw.close();
		}
			
		
		
	}

}
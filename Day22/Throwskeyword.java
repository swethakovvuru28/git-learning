package Day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throwskeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr=null;
		fr = new FileReader("C:\\SeleniumPractice\\Test.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);

	}

}

package Exception;
import java.io.*;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
	
		BufferedReader bReader = null; //변수 쓸수 있도록 밖으로 빼줘야함 
		String input = null;           //변수 쓸수 있도록 밖으로 빼줘야함 
		
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);

	}

}

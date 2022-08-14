package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B{
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null; //변수 쓸수 있도록 밖으로 빼줘야함 
		String input = null;           //변수 쓸수 있도록 밖으로 빼줘야함 
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);	
	}
}


class C {
	void run() throws FileNotFoundException, IOException  {
		B b = new B();
		b.run();
	
	}
}



public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

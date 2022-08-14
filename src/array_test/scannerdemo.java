package array_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	    }
	}

}

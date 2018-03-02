package runner;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MainApp2 {

	public static void main(String[] args) {
		private static final String FILE_PARTH = "resourses/F1";
		//InputStream is = new FileInputStream(FILE_PARTH);
		//BufferedInputStream bis = new BufferedInputStream(is);

		try(BufferedInputStream bis = new BufferedInputStream( new FileInputStream(FILE_PARTH))){
		
			int count =0;
			byte[] bytes = new byte[1024];
			do {
				count = bis.read(bytes);
			} while (count > 0);
			System.out.print(count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	
		}
	}



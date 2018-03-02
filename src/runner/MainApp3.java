package runner;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.print.DocFlavor.READER;

public class MainApp3 {
	private static final String FILE_PARTH = "resourses/F1";

	public static void main(String[] args) {

		// Reader reader = new FileReader(FILE_PARTH);
		// BufferedReader br = new BufferedReader(reader);
		// InputStream is = new FileInputStream(FILE_PARTH);
		// BufferedInputStream bis = new BufferedInputStream(is);

		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PARTH))) { //читаем из файлы   .. читам потом из буфера
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

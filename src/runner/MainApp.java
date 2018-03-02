package runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import javax.imageio.stream.FileImageInputStream;

public class MainApp {
	private static final String FILE_PARTH = "resourses/F1";

	public static void main(String[] args) {

		OutputStream os;
		// InputStream is = null;
		// try {
		// is = new FileInputStream("resourses/F1.txt");
		//
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (is != null) {
		// is.close();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		try (Reader reader = new FileReader(FILE_PARTH)) {
			char[] chars = new char[1024];
			byte[] bytes = new byte[1024];
			int count2;
			do {
				count2 = reader.read(chars);
				System.out.print(count2);
			} while (count2 > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] bytes = new byte[1024];
		System.out.print(new String(bytes));

		try (InputStream is = new FileInputStream(FILE_PARTH)) {
			int count;
			byte[] bytes = new byte[1024];
			char[] chars = new char[1024];
			do {
				count = is.read(bytes);
				System.out.print((char) count);
			} while (count > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

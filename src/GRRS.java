import java.io.*;
import au.com.bytecode.opencsv.*;
import java.util.*;

public class GRRS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader file;
		ListIterator<String[]> iterator;
		List<String[]> list;
		CSVReader reader;
		String[] tokens;
		int lineNumber = 0;
		Test test;
		
		try {
			file = new FileReader("full_test_data.txt");
		} catch(FileNotFoundException ex) {
			System.out.println(ex);
			return;
		}
		reader = new CSVReader(file, '\t');
		try {
			list = reader.readAll();
		} catch(IOException ex) {
			System.out.println("Error reading file:");
			System.out.println(ex);
			return;
		}
		test = new Test(list);
		System.out.println(test);
	}

}

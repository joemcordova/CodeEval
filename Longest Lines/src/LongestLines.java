import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortByLength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length()) {
			return 1;
		}
		else if (o1.length() > o2.length()) {
			return -1;
		}
		return 0;
	}	
}

public class LongestLines {
	// Write a program to read a multiple line text file and write 
	// the 'N' longest lines to stdout. Where the file to be read 
	// is specified on the command line.

	public static void main(String[] args) throws IOException {
		List<String> lines = readLines(args[0]);
		int count = Integer.parseInt(lines.get(0));
		Collections.sort(lines, new sortByLength());
		for (int i = 0; i < count; i++) {
			System.out.println(lines.get(i));
		}
	}

	static List<String> readLines(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		List<String> lines = new ArrayList<String>();
	    String currentLine;
	    while ((currentLine = br.readLine()) != null) {
	    	lines.add(currentLine);
	    }
	    br.close();
		return lines;
	}
}

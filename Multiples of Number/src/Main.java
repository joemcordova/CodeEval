import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		// Given numbers x and n, where n is a power of 2, print out 
		// the smallest multiple of n which is greater than or equal 
		// to x. Do not use division or modulo operator.
		
		List<String> lines = readLines(args[0]);
		int result, n, x;
		for (int idx = 0; idx < lines.size(); idx++) {
			String[] line = lines.get(idx).split(",");
			x = Integer.parseInt(line[0]);
			n = Integer.parseInt(line[1]);
			result = n;
			while (result < x) {
				result += n;
			}
			System.out.println(result);
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

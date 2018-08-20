
//the method to read a file line by line and make it to strings
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteTest {

	public static void main(String[] args) {
		String inFilename = "enter.txt";
		String outFilename = "output.txt";
		//the try and catch the exception when the file is read by the computer
		try {
			Scanner in = new Scanner(new File(inFilename));
			PrintWriter out = new PrintWriter(new File(outFilename));
			while (in.hasNext()) {
				String line = in.nextLine();
				try1 k=new try1();
				System.out.println(k.Q(k.enter(k.toString(line))));
				out.println(k.Q(k.enter(k.toString(line))));
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("couldn't open file: " + e.getMessage());
		}
	}

}



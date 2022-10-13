package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String Shape = in.next();
		int redComponent=in.nextInt();
		int greenComponent= in.nextInt();
		int blueComponent =in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x1 =in.nextDouble();
		double x2 = in.nextDouble();
		double x3=in.nextDouble();
		double x4 = in.nextDouble();
		StdDraw.rectangle(x1, x2, x3, x4);
		
		
	}
}

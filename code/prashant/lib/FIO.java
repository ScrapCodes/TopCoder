package prashant.lib;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIO {
	File file =null;
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;

	public void fInit(String args) {

		try {
			file = new File(args);
			fis = new FileInputStream(file);

			// Here BufferedInputStream is added for fast reading.
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public String finput() {

		try {
			// dis.available() returns 0 if the file does not have more lines.
			if (dis.available() != 0) {

				// this statement reads the line from the file and print it to
				// the console.
				return dis.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void fClose() {
		// dispose all the resources after using them.
		try {
			fis.close();
			bis.close();
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

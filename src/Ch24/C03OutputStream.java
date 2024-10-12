package Ch24;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C03OutputStream {
	public static void main(String[] args) throws Exception {
//		OutputStream out = new FileOutputStream("c:\\iotest\\test.exe");
		OutputStream out = new FileOutputStream("/Users/popo/iotest/text.exe");
		out.write('a');
		out.write('b');
		out.write('c');
		out.flush();
	}

}

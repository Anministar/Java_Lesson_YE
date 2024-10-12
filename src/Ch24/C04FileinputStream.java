package Ch24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C04FileinputStream {
	public static void main(String[] args) throws IOException {
		// 코드는 바이너리 파일 대신에 텍스트 파일을 읽어오고, 각 문자를 화면에 출력하는 예제
//		InputStream in = new FileInputStream("c:\\iotest\\output.exe");
		InputStream in = new FileInputStream("/Users/popo/iotest/output.exe");
		while(true) {
			int data = in.read();
			if(data == -1) {
				break;
			}
			System.out.print((char) data + " ");
		}
	}

}

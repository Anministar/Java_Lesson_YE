package Ch24;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02Reader {
	
	public static void main(String[] args) {
		// 파일 경로 설정
		String filePath = "c:\\iotest\\test.txt";
		
//		Reader in = new FileReader("c:\\iotest\\test.txt");
		
		try {
			Reader in = new FileReader("/Users/popo/iotest/test.txt");
			
			// 파일에서 한 글자씩 읽어오기
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				System.out.print((char) data);
			}
			
			// 스트림 닫기
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

package Ch24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04FileOutputStream {
	public static void main(String[] args) {
		// String 경로 설정
//		String filePath = "c:\\iotest\\output.exe";
		String filePath = "/Users/popo/iotest/output.exe";
		
		// 컴파일된 이진 코드와 필요한 리소스가 아니라 텍스트를 넣을꺼기 때문에 실행은 X
		
		try {
			// FileOutputStream을 사용하여 파일에 바이트 쓰기
			OutputStream out = new FileOutputStream(filePath);
			
			// 문자열 "Hello, World!"을 파일에 쓰기
			out.write('H');
			out.write('e');
			out.write('l');
			out.write('l');
			out.write('o');
			out.write(',');
			out.write('W');
			out.write('o');
			out.write('r');
			out.write('l');
			out.write('d');
			out.write('!');
			
			// flush 메서드를 사용하여 버퍼 비우기
			out.flush();
			
			// 스트림 닫기
			out.close();
			
			System.out.println("파일에 내용을 쓰기 완료했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

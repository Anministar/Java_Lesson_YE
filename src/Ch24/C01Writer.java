package Ch24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {

	public static void main(String[] args) {
		// 파일 경로설정
//		String filePath = "c:\\iotest\\test.txt";
		String filePath = "/Users/popo/iotest/test.txt";
		
		try {
			// FileWriter를 사용하여 파일에 텍스트를 추가 (true는 기존 내용을 유지하고, 파일 끝에 내용을 추가)
			// true 옵션 : 내용 추가
			// flase 옵션 : 갱신 == 덮어쓰기
			
			// ### 객체를 만든다는 의미 == 파일 오픈(열다) ###
			Writer out = new FileWriter(filePath, true);
			
			// 추가할 텍스트 작성
			out.write("안녕하세요\n");
			out.write("파일 테스트입니다\n");
			
			out.write("파일을 생성하고 있어요\n");
			
			// 버퍼를 비우고 스트림을 닫음
			out.flush();
			
			// ### 파일 닫기 ###
			out.close();
			
			System.out.println("텍스트가 파일에 추가되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

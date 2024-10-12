package Ch24;

public class Ch24 {
	
	// FileWriter와 FileReader는 각각 Writer와 Reader 클래스의 하위 클래스
	// 이 두 클래스는 Java I/O (Input/Output) 스트림을 다루기 위한 클래스들 중 일부
	
	// ### Writer 클래스 ###
	// **java.io.Writer**는 문자 기반 스트림을 처리하는 추상 클래스
	// 모든 하위 클래스들은 문자 데이터를 기록할 수 있는 기능을 제공
	// 주로 write(char[] cbuf), write(String str), write(int c) 등의 메서드를 포함하고 있음.
	// FileWriter는 Writer의 하위 클래스로서 파일에 문자를 쓰기 위해 사용됨.
	
	
	// ### FileWriter 클래스 ###
	// **java.io.FileWriter**는 파일에 문자를 쓰기 위한 클래스
	// FileWriter는 Writer 클래스를 확장하여 파일에 문자 데이터를 기록할 수 있음.
	// 주로 write(char[] cbuf), write(String str), write(int c) 등의 메서드를 사용하여 파일에 문자를 작성할 수 있음.
	
	
	// ### Reader 클래스 ###
	// **java.io.Reader**는 문자 기반 스트림을 처리하는 추상 클래스
	// 모든 하위 클래스들은 문자 데이터를 읽을 수 있는 기능을 제공
	// 주로 read(char[] cbuf), read(), skip(long n) 등의 메서드를 포함하고 있음
	// FileReader는 Reader의 하위 클래스로서 파일에서 문자를 읽기 위해 사용됨.
	
	
	// ### FileReader 클래스 ###
	// **java.io.FileReader**는 파일에서 문자를 읽기 위한 클래스
	// FileRreader는 Reader 클래스를 확장하여 파일에서 문자 데이터를 읽을 수 있음.
	// 주로 read(char[] cbuf), read(), skip(long n) 등의 메서드를 사용하여 파일에서 문자를 읽을 수 있음.
	
	
	// 이러한 클래스들은 Java I/O에서 텍스트 파일을 처리할 때 유용하게 사용됨.
	// Writer와 Reader 계열의 클래스들은 문자 단위로 데이터를 처리하며, FileWriter와 FileReader는 이러한 기능을 파일에 적용할 수 있음.
	
	
	
	
	
	
	
	// ### FileInputStream & FileOutputStream ###
	// FileInputStream 및 FileOutputStream은 Java에서 파일 입출력을 담당하는 클래스들
	// 이 두 클래스는 InputStream과 OutputStream의 하위 클래스로, 각각 파일에서 데이터를 읽고 쓰는 기능을 제공
	
	
	// ### FileInputStream 클래스 ###
	// **java.io.FileInputStream**은 파일에서 바이트 단위로 데이터를 읽을 때 사용되는 클래스
	// 주로 read() 메서드를 사용하여 파일로부터 데이터를 읽어옴.
	// 파일의 끝에 도달하면 -1을 반환하며 읽기를 종료함
	// 예외인 IOException을 처리해야 함.
	
	
	// ### FileOutputStream 클래스 ###
	// **java.io.FfileOutputStream**는 파일에 바이트 단위로 데이터를 쓸 때 사용되는 클래스
	// 주로 write() 메서드를 사용하여 파일에 데이터를 씀.
	// 파일이 없으면 새로 생성하고, 파일이 이미 존재하면 덮어쓰게 됨.
	// 예외인 IOException을 처리해야 함.
	
	
	
	

}

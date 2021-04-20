package p10.textbook.s100501;

public class FileInputStream implements AutoCloseable{
	private String file;

	public FileInputStream(String file) {
		this.file = file;

	}
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file + "을 닫스빈다..");

	}

}

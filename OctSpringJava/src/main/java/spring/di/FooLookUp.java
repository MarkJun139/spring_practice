package spring.di;

public class FooLookUp {
	private Baz baz;
	
	public void doFooLookUp() {
		System.out.println("FooLookUp doFooLookUp() 실행");
		baz = getBaz();
		baz.doBaz();
	}
	
	//lookup 메서드 - 컨테이너가 baz라는 빈을 리턴
	public Baz getBaz() {
		return null;
	}
}

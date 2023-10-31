package spring.di;

public class Foo {
	Bar bar;
	Baz baz;

	int i;
	String str;
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

	public void doFoo() {
		System.out.println("Foo.doFoo() 실행");
		bar.doBar();
	}

	public Foo(Bar bar, Baz baz, int i, String str) {
		super();
		this.bar = bar;
		this.baz = baz;
		this.i = i;
		this.str = str;
	}
	
	
}

package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("diTest.xml"); 
		//컨테이너 만들기
		Foo f = context.getBean("foo1", Foo.class);
		//Foo f = (Foo)context.getBean("foo1"); 둘 중 하나
		f.doFoo();
		
		Foo f2 = context.getBean("foo2", Foo.class);
		System.out.println(f2.i);
		System.out.println(f2.str);
	}
}

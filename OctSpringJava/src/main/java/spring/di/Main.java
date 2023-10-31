package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("diTest.xml");
		
		
		//컨테이너 만들기
		Foo f = context.getBean("foo1", Foo.class);
		//Foo f = (Foo)context.getBean("foo1"); 둘 중 하나
		f.doFoo();
		
		System.out.println("========================");
		Fooo f2 = context.getBean("fooo4", Fooo.class);
		f2.doFooo();
		System.out.println(f2.i);
		System.out.println(f2.str);
		
		System.out.println("========================");
		Fooo f3 = context.getBean("fooo1", Fooo.class);
		System.out.println(f3.i);
		System.out.println(f3.str);
		System.out.println(f3.bar);
		
		System.out.println("========================");
		Fooo f4 = context.getBean("fooo2", Fooo.class);
		f4.doFooo();
		System.out.println(f4.i);
		System.out.println(f4.str);
		System.out.println(f4.bar);
		
		System.out.println("========================");
		FooLookUp f5 = context.getBean("fooLookUp", FooLookUp.class);
		f5.doFooLookUp();
		
		context.registerShutdownHook();
	}
}

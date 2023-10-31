package spring.anno;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	int i;
	
	public void doBar() {
		System.out.println("doBar() 실행");
	}

	public void setI(int i) {
		this.i = i;
	}

	
}

package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
//BeanFactory : 컨테이너
	public static void main(String[] args) {
	//	Resource resource = new ClassPathResource("applicationContext.xml");
		ApplicationContext beanFactory 
		= new GenericXmlApplicationContext("applicationContext.xml");
		
		WriteArticleService articleService 
		= (WriteArticleService) beanFactory.getBean("writeArticleService");
		
		WriteArticleService articleService2
		= (WriteArticleService) beanFactory.getBean("writeArticleService2");
		
		articleService.write(new Article());
		articleService2.write(new Article());
	}
}
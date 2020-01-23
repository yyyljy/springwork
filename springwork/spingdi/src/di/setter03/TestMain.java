package di.setter03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		WriteArticleMgr mgr = factory.getBean("write", WriteArticleMgr.class);
		ArticleDTO article = new ArticleDTO("¿Ã¿Ã¿Ã", "asd", "asd", "asd");
		mgr.write(article);
	}
}

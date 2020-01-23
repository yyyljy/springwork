package di.constructor03;

public class OracleArticleDAO implements IArticleDAO {
	ArticleDTO article;
	
	public OracleArticleDAO(ArticleDTO article) {
		super();
		this.article = article;
	}
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Oracle");
		System.out.println(article.getName() + " insert ¿Ï·á");
	}

}

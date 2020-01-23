package di.setter03;

public class MysqlArticleDAO implements IArticleDAO {
	ArticleDTO article;
	public ArticleDTO getArticle() {
		return article;
	}
	public void setArticle(ArticleDTO article) {
		this.article = article;
	}
	public MysqlArticleDAO() {
		
	}
	public MysqlArticleDAO(ArticleDTO article) {
		super();
		this.article = article;
	}
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("MySQL");
		System.out.println(article.getName()+"Insert ¿Ï·á");
	}

}

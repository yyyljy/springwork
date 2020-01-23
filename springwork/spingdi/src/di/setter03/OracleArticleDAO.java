package di.setter03;

import di.setter03.ArticleDTO;

public class OracleArticleDAO implements IArticleDAO {
	ArticleDTO article;
	public ArticleDTO getArticle() {
		return article;
	}
	public void setArticle(ArticleDTO article) {
		this.article = article;
	}
	public OracleArticleDAO() {
		
	}
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

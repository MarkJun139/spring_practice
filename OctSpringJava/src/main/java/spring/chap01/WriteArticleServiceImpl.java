package spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDao articleDao;// 구현 객체 저장

	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao; //MySQLArticleDao 객체 저장
	}

	@Override
	public void write(Article article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}
}
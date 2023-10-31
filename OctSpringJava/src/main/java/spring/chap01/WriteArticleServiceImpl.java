package spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDao articleDao;// 구현 객체 저장

	
	//기본생성자 추가 : ★setter방식으로 주입시 기본 생성자 사용
	public WriteArticleServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao; //MySQLArticleDao 객체 저장
	} 


	@Override
	public void write(Article article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}
}
package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr계정의 job테이블을 제어하는 DAO클래스
@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate mytemplate;
	
	public int count() {
		return mytemplate.queryForObject("select count(*) from jobs",
				Integer.class);
	}

}

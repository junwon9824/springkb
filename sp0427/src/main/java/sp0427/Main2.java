package sp0427;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.nt.ConnectDescription;

public class Main2 {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		String sql = "Insert into bbs(no,title,writer_id,content,regdate)";
		sql += "values (BBS_SEQ.nextval, ?,?,?,SYSDATE )";
		tpl.update(sql, "sp_title", "user01", "스프링 jdbctemplate 테스트");
		System.out.println("등록 성공");
		
	}

}

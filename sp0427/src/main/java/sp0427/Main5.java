package sp0427;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.nt.ConnectDescription;
import sp0427.dto.BbsDto;

public class Main5 {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		
		String sql = "select count(*) from bbs ";
		Integer count = tpl.queryForObject(sql, Integer.class);
		System.out.println(count);

		sql = "select title  from bbs where no=?";
		String title = tpl.queryForObject(sql, String.class, 4);
		System.out.println(title);

	}

}

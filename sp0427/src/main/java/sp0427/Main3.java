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

public class Main3 {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		String sql = "select * from bbs order by no desc";
		List<BbsDto> list = tpl.query(sql, new BeanPropertyRowMapper<BbsDto>(BbsDto.class));

		for (BbsDto dto : list) {
			System.out.println(dto);
		}
		
	}

}

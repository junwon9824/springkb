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

public class Main4 {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		String sql = "select * from bbs where no=?";
		BbsDto dto = tpl.queryForObject(sql, new BeanPropertyRowMapper<BbsDto>(BbsDto.class), 4);

		System.out.println(dto);

	}

}

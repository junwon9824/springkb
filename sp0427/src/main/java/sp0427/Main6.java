package sp0427;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.nt.ConnectDescription;
import sp0427.dao.BbsDao;
import sp0427.dto.BbsDto;

public class Main6 {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BbsDao dao = context.getBean(BbsDao.class);
		List<BbsDto> list = dao.selectAll();

		for (BbsDto dto : list) {
			System.out.println(dto);
		}

	}

}

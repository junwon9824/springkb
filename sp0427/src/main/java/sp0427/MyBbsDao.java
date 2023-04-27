package sp0427;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sp0427.dto.BbsDto;

@Repository
public class MyBbsDao {

	@Autowired
	private SqlSessionTemplate tpl;

	public BbsDto selectOne(int no) {
		return tpl.selectOne("selectOne");
	}

	public List<BbsDto> selectAll() {

		return tpl.selectList("selectAll");

	}

	public int count() {
		return tpl.selectOne("count");
		
	}

}

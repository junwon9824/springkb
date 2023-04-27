package mvc_0427.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import mvc_0427.dto.CustomerDto;

@Repository
public class CustomerDao {

	@Autowired
	private JdbcTemplate tpl;

	public List<CustomerDto> selectAll() {

		String sql = "select * from bbs order by no desc";
		List<CustomerDto> list = tpl.query(sql, new BeanPropertyRowMapper<CustomerDto>(CustomerDto.class));

		return list;

	}

}

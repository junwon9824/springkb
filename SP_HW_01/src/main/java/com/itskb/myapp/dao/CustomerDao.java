package com.itskb.myapp.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.itskb.myapp.dto.CustomerDto;

@Repository
public class CustomerDao {

	@Autowired
	private SqlSessionTemplate tpl;

	public CustomerDto selectOne(int no) {
		return tpl.selectOne("selectOne", 4);
	}

	public List<CustomerDto> selectAll() {

		return tpl.selectList("selectAll");

	}

	public int count() {
		return tpl.selectOne("count");

	}

	public void insert(CustomerDto customerDto) {

		tpl.insert("insert", customerDto);

	}

}

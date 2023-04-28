package com.multicampus.kb03;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multicampus.kb03.dao.MyBbsDao;
import com.multicampus.kb03.dto.BbsDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BbsController {

	@Autowired
	private MyBbsDao bbsDao;

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/bbs/list")
	public String bbs_list(Model model) {
		List<BbsDto> list = bbsDao.selectAll();
		model.addAttribute("bbs_list", list);

		return "bbs/list";
	}

}

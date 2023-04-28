package com.itskb.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.itskb.myapp.dao.CustomerDao;
import com.itskb.myapp.dto.CustomerDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;

	@RequestMapping(value = "/customer/login", method = RequestMethod.GET)
	public String customer_login() {

		return "customer/login";
	}

	@RequestMapping(value = "/customer/login", method = RequestMethod.POST)
	public String customer_login_post(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("tel") String tel, HttpSession httpSession) {
		httpSession.setAttribute("name", name);
		httpSession.setAttribute("email", email);
		httpSession.setAttribute("tel", tel);

		return "redirect:/customer/personal";
	}

	@RequestMapping(value = "/customer/personal", method = RequestMethod.GET)
	public String customer_personal(Model model, HttpSession httpSession) {

		String email = (String) httpSession.getAttribute("email");

		CustomerDto customerDto = customerDao.selectOne(email);

		model.addAttribute("email", customerDto.getEmail());
		model.addAttribute("name", customerDto.getName());
		model.addAttribute("tel", customerDto.getTel());

		return "customer/personal";

	}

	@RequestMapping(value = "/customer/modify")
	public String customer_modify() {

		return "customer/modify";
	}

	@RequestMapping(value = "/customer/Register", method = RequestMethod.GET)
	public String customer_Register() {
		return "customer/Register";
	}

	@RequestMapping(value = "/customer/Register", method = RequestMethod.POST)
	public String Register_final(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("tel") String tel, @RequestParam("password") String password,
			@RequestParam("password2") String password2) {

		CustomerDto customerDto = new CustomerDto();

		customerDto.setName(name);
		customerDto.setEmail(email);
		customerDto.setTel(tel);
		customerDto.setPassword(password);
		customerDto.setPassword2(password2);
		System.out.println(customerDto);
		if (password.equals(password2)) {

			customerDao.insert(customerDto);
		}

		System.out.println("success");
		return "customer/login";
	}

}

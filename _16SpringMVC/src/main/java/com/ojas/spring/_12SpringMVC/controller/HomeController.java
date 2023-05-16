package com.ojas.spring._12SpringMVC.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.spring._12SpringMVC.Dao.BookDao;
import com.ojas.spring._12SpringMVC.model.Book;

@Controller
public class HomeController {

	@Autowired
	private BookDao bookdao;
	
//	@RequestMapping(value="/")
//    public ModelAndView test(HttpServletResponse response) throws IOException{
//        return new ModelAndView("home");
//    }

	@RequestMapping( method = RequestMethod.POST,value = "/createBooks")
	public ModelAndView test(@ModelAttribute Book book) throws IOException {
		bookdao.CreateBooks(book);
		return new ModelAndView("Create");
	}

}

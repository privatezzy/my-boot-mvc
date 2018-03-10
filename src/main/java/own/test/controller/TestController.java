package own.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value ="hehe", method = RequestMethod.GET)
	public ModelAndView toLogin(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value ="ftl", method = RequestMethod.GET)
	public ModelAndView toFreemark(HttpServletRequest request){
		request.setAttribute("user", "admin");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value ="html", method = RequestMethod.GET)
	public ModelAndView toHtml(){
		return new ModelAndView("MyHtml");
	}
}

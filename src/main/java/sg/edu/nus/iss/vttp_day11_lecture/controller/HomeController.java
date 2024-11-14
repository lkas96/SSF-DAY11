package sg.edu.nus.iss.vttp_day11_lecture.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @ResponseBody
    @RequestMapping(path = "/log", method = RequestMethod.GET)
    public String home(){

        logger.info("This is info message");
        logger.warn("This is a warning message");
        logger.error("This is a error message");
        logger.debug("This is a debug message");
        logger.trace("This is a trace message");

        return"Log in HomeController called...";
    }

    //Redirect to home page, path is relative and case sensitive points to home.html
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
}

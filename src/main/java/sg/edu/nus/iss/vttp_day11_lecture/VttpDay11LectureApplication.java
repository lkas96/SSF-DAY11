package sg.edu.nus.iss.vttp_day11_lecture;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class VttpDay11LectureApplication {

	public static void main(String[] args) {
		// SpringApplication.run(VttpDay11LectureApplication.class, args);
		SpringApplication app = new SpringApplication(VttpDay11LectureApplication.class);
		
		String port = "8080"; //Default port
		
		ApplicationArguments cliargs = new DefaultApplicationArguments(args);

		if(cliargs.containsOption("port")){
			port = cliargs.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		String dirFile = "";
		if (cliargs.containsOption("file")){
			dirFile = cliargs.getOptionValues("file").get(0);
			System.out.printf("Directory file: ", dirFile);
		}

		app.run(args);

	}

	@Bean
	public CommonsRequestLoggingFilter logging(){
		CommonsRequestLoggingFilter crlf = new CommonsRequestLoggingFilter();
		crlf.setIncludeClientInfo(true); //Set whether the client address and session id should be included in the log message.
		crlf.setIncludeQueryString(true); //Set whether the query string should be included in the log message.
		return crlf;
	}

}

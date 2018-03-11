package de.mazdermind.experiments.appengine.springboot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.AbstractEnvironment;

import com.google.appengine.api.utils.SystemProperty;

@SpringBootApplication
public class SpringBootExampleApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		configureProfileEnv();
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		configureProfileEnv();
		super.onStartup(servletContext);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootExampleApplication.class);
	}

	private static void configureProfileEnv() {
		boolean isCloud = (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production);
		if(isCloud) {
			System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "cloud");
		}
	}
}

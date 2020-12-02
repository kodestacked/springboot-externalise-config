package com.externalize.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@PropertySource("classpath:somefile.properties")
public class PropertiesResolver {
	
	private String springBootGreetings;
	
	private String textValue;

	public String getSpringBootGreetings() {
		return springBootGreetings;
	}

	public void setSpringBootGreetings(String springBootGreetings) {
		this.springBootGreetings = springBootGreetings;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
	
	
	
}

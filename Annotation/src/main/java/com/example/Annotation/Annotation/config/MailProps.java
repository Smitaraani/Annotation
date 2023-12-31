package com.example.Annotation.Annotation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mail")
@Component
public class MailProps {

    private String from;
    private String host;
    private String port;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public MailProps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailProps(String from, String host, String port) {
		super();
		this.from = from;
		this.host = host;
		this.port = port;
	}
	@Override
	public String toString() {
		return "MailProps [from=" + from + ", host=" + host + ", port=" + port + "]";
	}
    
    

}

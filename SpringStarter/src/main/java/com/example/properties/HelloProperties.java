package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello")
public class HelloProperties {

	private String gretting;

	private String msg;

	public String getGretting() {
		return gretting;
	}

	public void setGretting(String gretting) {
		this.gretting = gretting;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

package org.apache.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomRestTemplate extends RestTemplate{

	@Value("${zuul.url}")
	private String zuulUri;
	
	public String getZuulUri() {
		return zuulUri;
	}

	public void setZuulUri(String zuulUri) {
		this.zuulUri = zuulUri;
	}
	
}

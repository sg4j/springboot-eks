package org.apache.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceUtil {

	@Autowired
	private CustomRestTemplate restTemplate;
	
	public String getProductById(Integer productId){
		
		System.out.println("Came here in ProductServiceUtil.getProductById with service URL "+restTemplate.getZuulUri());
		
        String product = restTemplate.getForObject(restTemplate.getZuulUri().toString()+ "/productservice/product/{id}", String.class, productId);
        
        System.out.println("product found is "+product);
		return(product);
	}
}

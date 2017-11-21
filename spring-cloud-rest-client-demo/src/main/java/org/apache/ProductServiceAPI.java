package org.apache;

import org.apache.util.ProductServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceAPI {

	@Autowired
	private ProductServiceUtil productServiceUtil;
    
	@RequestMapping("/products/{id}")
	public String getPetById(@PathVariable int id ){
		
        String pet = productServiceUtil.getProductById(id);
        
		return(pet);
		
	}
}

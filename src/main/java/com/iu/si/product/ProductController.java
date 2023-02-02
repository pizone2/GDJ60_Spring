package com.iu.si.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@RequestMapping(value = "list")
	public String getProductList()throws Exception {
		
		List<ProductDTO> ar = ProductService.getProductList();
			
		System.out.println(ar.size()>0);
		
		return "product/productList";
	}
	
	
	@RequestMapping(value = "detail")
	public String getProductDetail() {
		System.out.println("Product Detail");
		return "product/productDetail";
	}
	
	//productAdd  
	@RequestMapping(value = "productAdd")
	public void getProductAdd() {
	}
	@RequestMapping(value = "Update")
	public ModelAndView getProductUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/productUpdate")	;
		return mv;
		}
	
	//
	
	
	
	
	
	
}

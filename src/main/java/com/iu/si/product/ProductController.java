package com.iu.si.product;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.si.util.Pager;

@Controller  //객체생성, Controller 역할
@RequestMapping("/product/*")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getProductList(Pager pager)throws Exception {
		ModelAndView mv = new ModelAndView();
		
		List<ProductDTO> ar = productService.getProductList(pager);
			
		
		mv.setViewName("product/productList");
		mv.addObject("list",ar);
		mv.addObject("pager", pager);
		return mv;
	}
	
	@RequestMapping(value = "detail")
	public String getProductDetail (ProductDTO productDTO, Model model) throws Exception{
		
		System.out.println("Product Detail");
		
		model.addAttribute("dto",productDTO);
		
		productDTO = productService.getProductDetail(productDTO);
		
		System.out.println(productDTO != null);
		
		
		return "product/productDetail";
	}
	
	//productAdd  //get
	@RequestMapping(value = "productAdd", method = RequestMethod.GET)
	public void setProductAdd() {
	}
	
	//post
	@RequestMapping(value = "productAdd", method = RequestMethod.POST)
	public String setProductAdd(ProductDTO productDTO)throws Exception {
//		ProductService productService;
		int result = productService.setProductAdd(productDTO,null);
		System.out.println(result == 1);
		return "redirect:./list";
	}
	
	
	@RequestMapping(value = "Update")
	public ModelAndView getProductUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/productUpdate")	;
		return mv;
		}
	
	
	
}

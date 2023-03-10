package com.iu.si.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.si.util.Pager;


@Service
public class ProductService {

	
	
	
	@Autowired
	private ProductDAO productDAO;

	//getProductLIst
	public List<ProductDTO> getProductList(Pager pager)throws Exception{
		
		pager.makeRow();
		Long totalCount = productDAO.getProductCount(pager);
		
		pager.makeNum(totalCount);
		
		
		return productDAO.getProductList(pager)	;
	}
	//getProductDetail
	public ProductDTO getProductDetail(ProductDTO productDTO) throws Exception{
		return productDAO.getProductDetail(productDTO);
	}
	//setAddProduct
	public int setProductAdd(ProductDTO productDTO,List<ProductOptinDTO> ar)throws Exception{
		//product , option
		Long productNum = productDAO.getProductNum();
		productDTO.setProductNum(productNum);
		int result = productDAO.setProductAdd(productDTO);
		
		if(ar != null) {
			
			for(ProductOptinDTO productOptionDTO:ar) {
				productOptionDTO.setProductNum(productNum);
				result = productDAO.setAddProductOption(null);
			}
		}
		return result;
	}
	

	

}
	
	
	
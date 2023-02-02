package com.iu.si.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired
	private ProductService productService;
	
	
	
	@Autowired
	private static ProductDAO productDAO;
	private ProductDTO productDTO;
//	@Autowired
//	private ProductDAO productDAO;
	
	public ProductService() {
		this.productDAO = new ProductDAO();
	}
	//4.호출해서 사용해야함,setter,결합도 약함,주소값만 참조하기 때문에 productDAO를 삭제하여도 DAO는 살아있음.
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public static List<ProductDTO> getProductList()throws Exception{
		return productDAO.getProductList()	;
	}
	
	public ProductDTO getProductDetail(ProductDTO productDTO) throws Exception{
		return productDAO.getProductDetail(productDTO);
//		return ProductDTO.this.getProductDetail();
//		return ProductDTO.getProductDetail(productDTO);
//		return ProductDTO.this.getProductDetail(productDTO);
	}
	
	
	
	
	public int setAddProduct(ProductDTO productDTO,List<ProductOptinDTO> ar)throws Exception{
		//product , option
		Long productNum = productDAO.getProductNum();
		productDTO.setProductNum(productNum);
		int result = productDAO.setAddProduct(productDTO);
		
		for(ProductOptinDTO productOptionDTO:ar) {
			productOptionDTO.setProductNum(productNum);
			result = productDAO.setAddProductOption(null);
		}
		return result;
	}
	

	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName("product1");
		productDTO.setProductDetail("detail1");
		
		ProductOptinDTO productOptinDTO = new ProductOptinDTO();
		productOptinDTO.setOptionName("optionName1");
		productOptinDTO.setOptionPrice(100L);
		productOptinDTO.setOptionAmount(10L);
		productOptinDTO.setProductNum(null);
		
		ProductOptinDTO productOptinDTO2 = new ProductOptinDTO();
		productOptinDTO2.setOptionName("optionName2");
		productOptinDTO2.setOptionPrice(200L);
		productOptinDTO2.setOptionAmount(20L);
		productOptinDTO2.setProductNum(null);
		
		try {
			Long num = productDAO.getProductNum();
			
			productDTO.setProductNum(num);
			
			int result = productDAO.setAddProduct(productDTO);
			
			productOptinDTO.setProductNum(num);
			
			if(result>0) {
				productDAO.setAddProductOption(productOptinDTO);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
	
	
	
package com.iu.si.product;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;

public class ProductDAOTest extends MyTestCase{

	@Autowired
	private ProductDAO productDAO;

	@Test
	public void getProductListTest()throws Exception {
		List<ProductDTO> ar = productDAO.getProductList(null)	;
		//단정문
		assertNotEquals(0, ar.size()); //ar의 사이즈가 0이 아니길 희망한다.
		
	}
	
	@Test
	public void getProductDetailTest()throws Exception{
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(1L);
		productDTO = productDAO.getProductDetail(productDTO);
		assertNotNull(productDTO); //Null이 아니길 희망한다.
	}
	
	//insert 임의의 번호	
	@Test
	public void setProductAddTest()throws Exception{
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(2L);
		productDTO.setProductDetail("Test");
		productDTO.setProductName("TestDetail");
		int result = productDAO.setProductAdd(productDTO);
		assertEquals(1, result); //result값이 true이길 희망한다.
	}
	
	
	
}

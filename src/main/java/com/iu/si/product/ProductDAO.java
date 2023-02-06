package com.iu.si.product;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.si.util.DBconnection;

import oracle.jdbc.driver.DBConversion;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	//Mapper의 위치
	//Mapper의 이름과 동일하게
	private final String NAMESPACE="com.iu.si.product.ProductDAO.";
	
	//delete
	public int setProductDelete(Long productNum)throws Exception {
		int result = 0;
		
		//1.DB 연결
		Connection con = DBconnection.getConnection();
		//2. SQL문 만들기
		String sql ="DELETE PRODUCT WHERE PRODUCTNUM=?";
		//3. SQL을 미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 를 셋팅하는단계
		st.setLong(1, productNum);
		//5. 최종전송 및 결과 처리
		result = st.executeUpdate();
		//6. 연결 해제
		DBconnection.disConnect(con, st);
		
		return result;
	}
	
	
	//getMax
	public Long getProductNum()throws Exception{
		Connection con = DBconnection.getConnection();
		
		String sql = "SELECT PRODUCT_SEQ.NEXTVAL FROM DUAL";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		Long num = rs.getLong(1);
		
		DBconnection.disConnect(rs, con, st);
		
		return num;
		
	}
	
	//--------------------------------------
	public List<ProductOptinDTO> getProductOptionList()throws Exception{
		List<ProductOptinDTO> ar = new ArrayList<ProductOptinDTO>();
		
		Connection con = DBconnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTOPTION";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			ProductOptinDTO productOptinDTO = new ProductOptinDTO();
			productOptinDTO.setOptionNum(rs.getLong("OPTIONNUM"));
			productOptinDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productOptinDTO.setOptionName(rs.getString("OPTIONNAME"));
			productOptinDTO.setOptionPrice(rs.getLong("OPTIONPRICE"));
			productOptinDTO.setOptionAmount(rs.getLong("OPTIONAMOUNT"));
			ar.add(productOptinDTO);
		}
		
		DBconnection.disConnect(rs, con, st);
		
		return ar;
	}
	
	public int setAddProductOption(ProductOptinDTO productOptinDTO) throws Exception {
		Connection con = DBconnection.getConnection();
		
		String sql="INSERT INTO PRODUCTOPTION (OPTIONNUM, PRODUCTNUM, OPTIONNAME, OPTIONPRICE, OPTIONAMOUNT) "
				+ "VALUES (PRODUCT_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, productOptinDTO.getProductNum());
		st.setString(2, productOptinDTO.getOptionName());
		st.setLong(3, productOptinDTO.getOptionPrice());
		st.setLong(4, productOptinDTO.getOptionAmount());
		
		int result = st.executeUpdate();
		
		DBconnection.disConnect(con, st);
		
		return result;
	}
	
	
	
	//--------------------------------------
	
	//getProductDetail
	
	public ProductDTO getProductDetail(ProductDTO productDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getProductDetail", productDTO);
	}
	
	public List<ProductDTO> getProductList()throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getProductList");
	}
	
	public int setAddProduct(ProductDTO productDTO)throws Exception{

		return sqlSession.delete(NAMESPACE+"setAddProduct", productDTO);
	}
	
}
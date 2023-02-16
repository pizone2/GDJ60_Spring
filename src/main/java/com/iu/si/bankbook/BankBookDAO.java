package com.iu.si.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.si.util.Pager;

@Repository
public class BankBookDAO {
	
		@Autowired
		private SqlSession sqlSession;
		private final String NAMESPACE="com.iu.si.bankbook.BankBookDAO.";
		
		public Long getBankBookCount(Pager pager)throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getBankBookCount",pager);
		}
		
		
		
		//getBankBookList
		
		
		
		public List<BankBookDTO> getBankBookList(Pager pager)throws Exception {
			return sqlSession.selectList(NAMESPACE+"getBankBookList",pager);
		}
		//getBankBookDetail
//		public BankBookDTO getBankBookDetail(BankBookDTO bankBookDTO)throws Exception {
//			return sqlSession.selectOne(NAMESPACE+"getBankBookDetail", bankBookDTO);
//		}
		
		 public BankBookDTO getBankBookDetail(BankBookDTO bankBookDTO) throws Exception {
			 return sqlSession.selectOne(NAMESPACE+"getBankBookDetail", bankBookDTO);
		 }
		//setBankBookAdd
		public int setBankBookAdd(BankBookDTO bankBookDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setBankBookAdd",bankBookDTO );
		}
		//setBankBookUpdate
		public int setBankBookUpdate(BankBookDTO bankBookDTO)throws Exception{
			return sqlSession.update(NAMESPACE+"setBankBookUpdate", bankBookDTO);
		}
		//setBankBookDelete
		public int setBankBookDelete(BankBookDTO bankBookDTO) throws Exception{
			return sqlSession.delete(NAMESPACE+"setBankBookDelete",bankBookDTO);
		}
		
		public int setBankBookImgAdd(BankBookImgDTO bankBookImgDTO)throws Exception{
			return sqlSession.insert(NAMESPACE+"setBankBookImgAdd", bankBookImgDTO);
		}
		
}

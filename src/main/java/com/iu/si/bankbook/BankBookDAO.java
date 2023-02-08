package com.iu.si.bankBook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
		@Autowired
		private SqlSession sqlSession;
		private final String NAMESPACE="com.iu.si.bankbook.BankBookDAO.";
		
		//getBankBookList
		public List<BankBookDTO> getBankBookList()throws Exception {
			return sqlSession.selectList(NAMESPACE+"getBankBookList");
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
}

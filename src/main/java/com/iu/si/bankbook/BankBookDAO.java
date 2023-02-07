package com.iu.si.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
		@Autowired
		private SqlSession sqlsession;
		private final String NAMESPACE="com.iu.si.bankbook.BankBookDAO";
		
		//getBankBookList
		public List<BankBookDTO> getBankBookList()throws Exception {
			return sqlsession.selectList(NAMESPACE+"getBankBookList");
		}
		//setBankBookDetail
		public int setBankBookDetail(BankBookDTO bankBookDTO)throws Exception {
			return sqlsession.delete(NAMESPACE+"setBankBookDetail", bankBookDTO);
		}
		//setBankBookAdd
		public int setBankBookAdd(BankBookDTO bankBookDTO)throws Exception{
			return sqlsession.insert(NAMESPACE+"setBankBookAdd",bankBookDTO );
		}
		//setBankBookUpdate
		public int setBankBookUpdate(BankBookDTO bankBookDTO)throws Exception{
			return sqlsession.update(NAMESPACE+"setBankBookUpdate", bankBookDTO);
		}
}

package com.iu.si.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.iu.si.board.BbsDAO;
import com.iu.si.board.BbsDTO;
import com.iu.si.util.Pager;

@Repository
public class BankBookCommentDAO implements BbsDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.iu.si.bankbook.BankBookCommentDAO.";
	
	
	@Override
	public Long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}

	@Override
	public List<BbsDTO> getBoardList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getBoardList", pager);
	}
	


	
	@Override
	public int setBoardAdd(BbsDTO bbsDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setBoardAdd", bbsDTO);
	}



	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setBoardUpdate", bbsDTO);
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setBoardDelete", bbsDTO);
	}
	
	
	
	
}

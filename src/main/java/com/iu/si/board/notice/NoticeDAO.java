package com.iu.si.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.si.board.BbsDTO;
import com.iu.si.board.BoardDAO;
import com.iu.si.board.BoardDTO;
import com.iu.si.board.BoardFileDTO;
import com.iu.si.util.Pager;

@Repository
public class NoticeDAO implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.si.board.notice.NoticeDAO.";
	
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
	public int setBoardAdd(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setBoardAdd", bbsDTO);
	}

	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setBoardDelete", bbsDTO);
	}

	@Override
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getBoardDetail", boardDTO);
	}

	@Override
	public int setBoardFileAdd(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setBoardFileAdd", boardFileDTO);
	}

	@Override
	public List<BoardFileDTO> getBoardFileList(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getBoardFileList", bbsDTO);
	}
	
	@Override
	public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getBoardFileDetail", boardFileDTO);
	}
	
	

}
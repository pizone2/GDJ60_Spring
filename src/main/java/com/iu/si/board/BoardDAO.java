package com.iu.si.board;

import java.util.List;

public interface BoardDAO extends BbsDAO {
	
	//list 
	
	//detail
	public BoardDTO getBoardDetail(BoardDTO boardDTO)throws Exception;
	
	//add
	
	//fileAdd
	public int setBoardFileAdd(BoardFileDTO boardFileDTO)throws Exception;
	
	//update
	
	//delete
	
	//BoardFileList
	public List<BoardFileDTO> getBoardFileList(BbsDTO bbsDTO) throws Exception;
	
}

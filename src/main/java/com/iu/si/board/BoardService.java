package com.iu.si.board;

import org.springframework.web.multipart.MultipartFile;

public interface BoardService extends BbsService{

		public BoardDTO getBoardDetail(BoardDTO boardDTO)throws Exception;

		public BoardFileDTO getBoardFileDetail(BoardFileDTO boardFileDTO)throws Exception;
		


}

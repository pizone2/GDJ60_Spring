package com.iu.si.board.notice;

import java.util.List;

import com.iu.si.board.BoardDTO;
import com.iu.si.board.BoardFileDTO;

public class NoticeDTO extends BoardDTO {
	
	private List<BoardFileDTO> boardFileDTOs;
	
	
	public List<BoardFileDTO> getBoardFileDTOs() {
		return boardFileDTOs;
	}
	public void setBoardFileDTOs(List<BoardFileDTO> boardFileDTOs) {
		this.boardFileDTOs = boardFileDTOs;
	}

}
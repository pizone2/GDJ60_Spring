package com.iu.si.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.iu.si.util.Pager;

public interface BbsService {
	
	//list
	public List<BbsDTO> getBoardList(Pager pager)throws Exception;
		
	//insert
	public int setBoardAdd(BbsDTO bbsDTO,MultipartFile[] multipartFiles,HttpSession session)throws Exception;
	
	//update
	public int setBoardUpdate(BbsDTO bbsDTO)throws Exception;
	
	//delete
	public int setBoardDelete(BbsDTO bbsDTO,HttpSession session)throws Exception;
}

package com.iu.si.board.qna;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.si.board.BbsDAO;
import com.iu.si.board.BbsDTO;
import com.iu.si.board.BoardDTO;
import com.iu.si.board.BoardFileDTO;
import com.iu.si.board.BoardService;
import com.iu.si.util.FileManager;
import com.iu.si.util.Pager;
@Service
public class QnaService implements BoardService{
	
	@Autowired
	private QnaDAO qnaDAO;
	@Autowired
	private FileManager fileManager;

	@Override
	public List<BbsDTO> getBoardList(Pager pager) throws Exception {
		pager.makeRow();
		pager.makeNum(qnaDAO.getTotalCount(pager));
		return qnaDAO.getBoardList(pager);
	}

	@Override
	public int setBoardAdd(BbsDTO bbsDTO,MultipartFile [] multipartFiles,HttpSession session) throws Exception {
		int result = qnaDAO.setBoardAdd(bbsDTO);
		
		//file HDD에 저장
		String realPath = session.getServletContext().getRealPath("resources/upload/qna/");
		System.out.println(realPath);
		 System.out.println(4);
		 System.out.println(multipartFiles.length);
		
		for(MultipartFile multipartFile: multipartFiles) {
			System.out.println(3);
			if(multipartFile.isEmpty()) {
				continue;
			}
			System.out.println(2);
			String fileName = fileManager.fileSave(multipartFile, realPath);
						
			//DB INSERT
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setNum(bbsDTO.getNum());
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(multipartFile.getOriginalFilename());
				
			result=qnaDAO.setBoardFileAdd(boardFileDTO);
				
			}
			
		return result;
	}

	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		//조회만 미리
		List<BoardFileDTO> ar = qnaDAO.getBoardFileList(bbsDTO);
		int result =  qnaDAO.setBoardDelete(bbsDTO);//cascade시 모두 삭제되니깐 위에 조회먼저
		
		if(result>0) {// 잘 지워졌으면~~
			
			String realPath = session.getServletContext().getRealPath("resources/upload/qna/");
			
			for(BoardFileDTO boardFileDTO : ar) { 
			 boolean check = fileManager.fileDelete(realPath, boardFileDTO.getFileName());
			}
		}
		
		return result;
	}

	@Override
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getBoardDetail(boardDTO);
	}
	
	//reply Insert
	public int setReplyAdd(QnaDTO qnaDTO)throws Exception{
		//QnaDTO
		//num : 부모의 글번호
		//wrier , title , contents : 답글로 입력한 값
		//ref : null
		//step : null
		//depth : null
		
		//1.부모의 정보를 조회
		QnaDTO parent = (QnaDTO) qnaDAO.getBoardDetail(qnaDTO);
		//ref : 부모의 ref
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(null);
		//step : 부모의 step+1
		qnaDTO.setStep(parent.getStep()+1);
		//depth : 부모의 depth +1
		qnaDTO.setDepth(parent.getDepth()+1);
		
		//2.Step update
		 int result =  qnaDAO.setStepUpdate(parent);
		 //3.답글 insert
		result = qnaDAO.setReplyAdd(qnaDTO);
		 
		
		
		return result;
		
	}



	
}

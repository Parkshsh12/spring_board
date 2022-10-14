package com.seedit.edu.sample.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedit.edu.sample.dao.BoardDAO;
import com.seedit.edu.sample.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> getBoardList(BoardDTO boardDto) throws Exception {
		return boardDao.getBoardList(boardDto);
	}

	@Override
	public void insertBoard(BoardDTO boardDto) throws Exception {
		boardDto.setBoardSubject("sdfsdafsdacuiewhafjkdshicfwnjakcnhsdicㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ러아ㅣ넘팰ㅈ무파ㅣㅇ너챚마리ㅜㄴ애ㅑ추미;ㅈㄷ라ㅣ느채ㅑㅜㅈ마ㅣㄹ;ㅇㄴㅁ랴ㅐㄴ우ㅏㅣ렁나러안리ㅓㄴ어린어린닌닌ㄴㄹㄴ러ㅑㄴㄹ너ㅑㄹㄴㄹㄴㅀㄴㅅㄽㄴㄹㅇㅅㄹㄴㅅㅇㄹㄴㅅㅇㄽㄴㅁㄹㅇㅅㅁㄴㄹㅇㅅㄴㅁㄹㅇㅅㅁㄴㄽㅇㄻㄴㅅㅇㄻㄴㅅㅇㄻㅅ");
		boardDao.insertBoard(boardDto);
	}

	@Override
	public Map<String, Object> selectBoardDetail(BoardDTO boardDto) throws Exception {
		boardDao.updateHitCnt(boardDto);
		Map<String, Object> resultMap = boardDao.selectBoardDetail(boardDto);
		String searchType = boardDto.getSearchType();
		
		if("S".equals(searchType)){
			int updateHitCnt = boardDao.updateHitCnt(boardDto);
			
			if(updateHitCnt > 0){
				resultMap = boardDao.selectBoardDetail(boardDto);
			}
		} else{
			resultMap = boardDao.selectBoardDetail(boardDto);
		}
		return resultMap;
	}

	@Override
	public BoardDTO updateBoard(BoardDTO boardDto) throws Exception {
		
		BoardDTO boardDTO = new BoardDTO();
		
		boardDto.setBoardSubject("ㅁㄴㅇㅁㅇㅁㄴㅇㄴㅁㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴㅁㅇㅁㄴㅇㅈㅂㄷㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㅈㄷㅂㄷㅂㅈㄷㅂㅈㄷㅂㅈㄷㅂㅈㄷㄴㅇㅁ");
		
		int updateCnt = boardDao.updateBoard(boardDto);
		
		if(updateCnt > 0){
			boardDTO.setResult("SUCCESS");
			boardDTO.setCallBackId("updateBoard");
		} else{
			boardDTO.setResult("FAIL");
		}
		return boardDTO;
	}

	@Override
	public BoardDTO deleteBoard(BoardDTO boardDto) throws Exception {
		
		BoardDTO boardDTO = new BoardDTO();
		
		int deleteCnt = boardDao.deleteBoard(boardDto);
		
		if(deleteCnt > 0){
			boardDTO.setResult("SUCCESS");
			boardDTO.setCallBackId("deleteBoard");
		} else{
			boardDTO.setResult("FAIL");
		}
		return boardDTO;
	}

}

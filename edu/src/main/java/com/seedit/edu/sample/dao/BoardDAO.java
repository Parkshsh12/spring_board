package com.seedit.edu.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.seedit.edu.common.dao.AbstractDAO;
import com.seedit.edu.sample.dto.BoardDTO;

@Repository
public class BoardDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public List<BoardDTO> getBoardList(BoardDTO boardDto) throws Exception {
		return selectList("sampleBoardList.getBoardList", boardDto);
	}
	
	public void insertBoard(BoardDTO boardDto) throws Exception{
		insert("sampleBoardList.insertBoard", boardDto);
	}
	
	public int updateHitCnt(BoardDTO boardDto) throws Exception{
		return (Integer)update("sampleBoardList.updateHitCnt", boardDto);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(BoardDTO boardDto) throws Exception{
		return (Map<String, Object>) selectOne("sampleBoardList.selectBoardDetail", boardDto);
	}
	
	public int updateBoard(BoardDTO boardDto) throws Exception {
		return  (Integer) update("sampleBoardList.updateBoard", boardDto);
	}
	
	public int deleteBoard(BoardDTO boardDto) throws Exception {
		return (Integer) update("sampleBoardList.deleteBoard", boardDto);
	}
}

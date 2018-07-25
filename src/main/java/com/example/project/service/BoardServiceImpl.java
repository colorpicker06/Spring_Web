package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.model.dao.BoardDAO;
import com.example.project.model.dto.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
@Inject BoardDAO boardDao;
	
	@Override
	public void create(BoardVO vo) {
		String title=vo.getTitle();
		String content=vo.getContent();
		String writer=vo.getWriter();
		
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		boardDao.create(vo);	
	}

	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub
		
	}

	//게시글 전체 목록 보기
	@Override
	public List<BoardVO> listAll() {
		
		return boardDao.listAll();
	}

	@Override
	public void increaseViewcnt() {
		// TODO Auto-generated method stub
		
	}

}

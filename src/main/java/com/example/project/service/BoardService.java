package com.example.project.service;

import java.util.List;

import com.example.project.model.dto.BoardVO;

public interface BoardService {
	
	//01. �Խñ� �ۼ�
	public void create(BoardVO vo);
	
	//02.�Խñ� �󼼺���
	public BoardVO read(int bno);
	
	//03. �Խñ� ����
	public void update(BoardVO vo);
	
	//04. �Խñ� ����
	public void delete(int bno);
	
	//05.�Խñ� ��ü ���
	public List<BoardVO> listAll();
	
	//06.�Խñ� ��ȸ
	public void increaseViewcnt();


}
package com.example.project.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.dto.BoardVO;
import com.example.project.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	//RequestMapping �� �ߺ����� �κ��� �����ؼ� ����غ���.
	
	@Inject BoardService boardService;
	//01 �Խù� ��� ����
	@RequestMapping("list.do")
	public ModelAndView list() { //modelandview �� model�� �䰡 ���յ� �����̴�. sting���� ��ȯ���� �ٸ���.
		List<BoardVO> list = boardService.listAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/list");
		mav.addObject("list",list);
		return mav;		
	}
	
	//02. �Խñ� ȭ��
	@RequestMapping("write.do")
	public String write() {
		return "board/write";
	}
	
	//02-01. �Խñ� �Է�
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute BoardVO vo) {
		boardService.create(vo);
		
		return "redirect:list.do";
	}
	

}

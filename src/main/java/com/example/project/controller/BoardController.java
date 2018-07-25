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
	//RequestMapping 의 중복적이 부분을 통일해서 사용해보기.
	
	@Inject BoardService boardService;
	//01 게시물 목록 보기
	@RequestMapping("list.do")
	public ModelAndView list() { //modelandview 라서 model과 뷰가 결합된 형태이다. sting과는 반환값이 다르다.
		List<BoardVO> list = boardService.listAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/list");
		mav.addObject("list",list);
		return mav;		
	}
	
	//02. 게시글 화면
	@RequestMapping("write.do")
	public String write() {
		return "board/write";
	}
	
	//02-01. 게시글 입력
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute BoardVO vo) {
		boardService.create(vo);
		
		return "redirect:list.do";
	}
	

}

package com.tutorials.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorials.board.dao.BoardDAO;
import com.tutorials.board.vo.Board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	private final BoardDAO dao;
	
	@GetMapping("/boards")
	public String boards(Model model) throws Exception {
		log.info("[BoardController] /boards");
		
		List<Board> boards = dao.selectAll();
		model.addAttribute("boards", boards);
		return "boards";
	}
	
}

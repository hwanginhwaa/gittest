package com.tutorials.board.vo;

import java.time.LocalDateTime;

import lombok.Data;

// lombok : constructor, Getter, Setter, hashCode(), equal
@Data
public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;
}

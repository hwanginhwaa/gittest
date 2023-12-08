package com.tutorials.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tutorials.board.vo.Board;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardDAO {
	private final JdbcTemplate jdbcTemplate;
	
	public void insert(Board board) throws Exception {		//입력
		String sql = "INSERT INTO board VALUES (seq_board.nextval, ?, ?, ?, sysdate)";
		jdbcTemplate.update(sql,
				board.getTitle(),
				board.getContent(),
				board.getWriter());
	}
	
	public void delete(Integer boardNo) throws Exception {		//삭제
			String sql = "DELETE FROM board WHERE boardno = ?";
			jdbcTemplate.update(sql, boardNo);
	}
	
	public void update(Board board) throws Exception {			//수정
		String sql = "UPDATE board SET title=?, content=?, writer=?, WHERE boardno=?";
		jdbcTemplate.update(sql,
				board.getTitle(),
				board.getContent(),
				board.getWriter(),
				board.getBoardNo());
	}
	
	public Board select(Integer boardNo) throws Exception {		//검색:게시판 번호, 1건
		List<Board> boards = jdbcTemplate.query("SELECT * FROM board WHERE boardno = ?",
				new RowMapper<Board>() {
					
					@Override
					public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
						Board board = new Board();
						board.setBoardNo(rs.getInt("boardno"));
						board.setTitle(rs.getString("title"));
						board.setContent(rs.getString("content"));
						board.setWriter(rs.getString("writer"));
						board.setRegDate(rs.getTimestamp("regdate").toLocalDateTime());
						return null;
					}
		}, boardNo);
		
		return boards.isEmpty() ? null : boards.get(0);		//첫번쨰 검색 결과만 리턴
		
}
	
	public List<Board> selectAll() throws Exception {		//전체
		List<Board> boards = jdbcTemplate.query(
				"SELECT * FROM board ORDER BY boardno DESC, regdate DESC", //최근 내용부터 검색
				new RowMapper<Board>() {
					
					@Override
					public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
						Board board = new Board();
						board.setBoardNo(rs.getInt("boardno"));
						board.setTitle(rs.getString("title"));
						board.setContent(rs.getString("content"));
						board.setWriter(rs.getString("writer"));
						board.setRegDate(rs.getTimestamp("regdate").toLocalDateTime());
						return null;
					}
		});
		
		return boards;
		
}
	
	
}

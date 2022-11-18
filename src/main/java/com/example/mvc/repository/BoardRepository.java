package com.example.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.mvc.dto.Board;

@Repository
public class BoardRepository {

    static public ArrayList<Board> boards;

    static {
        boards = new ArrayList<>();
        boards.add(new Board("son", "hello", "안녕하세요"));
        boards.add(new Board("son1", "spring", "자바"));

    }

    // 등록
    public Board insertBoard(Board board) {
        boards.add(board);
        return board;
    }

    // 조회(전체 조회)
    public List<Board> getAllBoard() {
        return boards;
    }

    // 특정 제목 조회
    public Board gettitle(String title) {
        return boards.stream().filter(Board -> Board.getTitle().equals(title))
                .findAny()
                .orElse(new Board("", "", ""));
    }

    // 수정
    public void updateBoard(String title, Board board) {
        boards.stream().filter(Board -> Board.getTitle().equals(title))
                .findAny()
                .orElse(new Board("", "", ""))
                .setContent(board.getContent());
    }

    // 삭제
    public void delete(String title) {
        boards.removeIf(Board -> Board.getTitle().equals(title));
    }
}

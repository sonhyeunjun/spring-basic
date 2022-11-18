package com.example.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.dto.Board;
import com.example.mvc.repository.BoardRepository;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 등록
    public Board insertBoard(Board board) {
        return boardRepository.insertBoard(board);
    }

    // 전체 조회
    public List<Board> getAllBoard() {
        return boardRepository.getAllBoard();
    }

    // 조회(특정)
    public Board gettitle(String title) {
        return boardRepository.gettitle(title);
    }

    // 수정
    public void updateBoard(String title, Board board) {

        boardRepository.updateBoard(title, board);

    }

    // 삭제
    public void delete(String title) {
        boardRepository.delete(title);
    }

}

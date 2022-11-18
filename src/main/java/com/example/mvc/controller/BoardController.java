package com.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.dto.Board;
import com.example.mvc.service.BoardService;

@RestController
@RequestMapping(value = "/boards")
public class BoardController {


    @Autowired
    private BoardService boardService;

    @PostMapping("")
    public Board insertBoard(@RequestBody Board board){
        return boardService.insertBoard(board);
    }

    @GetMapping
    public List<Board> getAllBoard() {
        return boardService.getAllBoard();
    }
    @GetMapping("/{title}")
    public Board gettitBoard(@PathVariable String title) {
        return boardService.gettitle(title);
    }

    @PutMapping("/{title}")
    public void updateBoard(@PathVariable String title, @RequestBody Board board) {
            boardService.updateBoard(title, board);
    }

    @DeleteMapping("/{title}")
    public void delete(@PathVariable String title) {
        boardService.delete(title);
    }
}

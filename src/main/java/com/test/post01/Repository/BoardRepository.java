package com.test.post01.Repository;

import java.util.Optional;

import com.test.post01.Dto.BoardDto;
import com.test.post01.model.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // Optional<Board> findByid(String id);
    // @Override
    // public BoardDto save(Board member);
}
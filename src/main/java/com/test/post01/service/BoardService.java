package com.test.post01.service;

import javax.transaction.Transactional;

import com.test.post01.Dto.BoardDto;
import com.test.post01.Repository.BoardRepository;
import com.test.post01.model.Board;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardDto infoDto) {
        // BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // infoDto.setPassword(encoder.encode(infoDto.getPassword()));

        return boardRepository.save(Board.builder().name(infoDto.getName()).age(infoDto.getAge())
                .build()).getId();
    }
}

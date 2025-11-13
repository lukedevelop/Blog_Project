package com.lukeprj.board_back.service;

import org.springframework.http.ResponseEntity;

import com.lukeprj.board_back.dto.request.board.PostBoardRequestDto;
import com.lukeprj.board_back.dto.request.board.PostCommentRequestDto;
import com.lukeprj.board_back.dto.response.board.GetBoardResponseDto;
import com.lukeprj.board_back.dto.response.board.GetCommentListResponseDto;
import com.lukeprj.board_back.dto.response.board.GetFavoriteListResponseDto;
import com.lukeprj.board_back.dto.response.board.IncreaseViewCountResponseDto;
import com.lukeprj.board_back.dto.response.board.PostBoardResponseDto;
import com.lukeprj.board_back.dto.response.board.PostCommentResponseDto;
import com.lukeprj.board_back.dto.response.board.PutFavoriteResponseDto;

public interface BoardService {
    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    ResponseEntity<? super GetFavoriteListResponseDto> getFavoriteList(Integer boardNumber);
    ResponseEntity<? super GetCommentListResponseDto> getCommetnList(Integer boardNumber);

    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);   
    ResponseEntity<? super PostCommentResponseDto> postComment(PostCommentRequestDto dto, Integer boardNumber, String email);
    
    ResponseEntity<? super PutFavoriteResponseDto> putFavorite(Integer boardNumber, String email);

    ResponseEntity<? super IncreaseViewCountResponseDto> increaseViewCount(Integer boardNumber);
}

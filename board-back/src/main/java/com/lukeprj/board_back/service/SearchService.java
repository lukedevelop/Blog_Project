package com.lukeprj.board_back.service;

import org.springframework.http.ResponseEntity;

import com.lukeprj.board_back.dto.response.search.GetPopularListResponseDto;
import com.lukeprj.board_back.dto.response.search.GetRelationListResponseDto;

public interface SearchService {
    
    ResponseEntity<? super GetPopularListResponseDto> getPopularList();
    ResponseEntity<? super GetRelationListResponseDto> getRelationList(String searchWord);
}

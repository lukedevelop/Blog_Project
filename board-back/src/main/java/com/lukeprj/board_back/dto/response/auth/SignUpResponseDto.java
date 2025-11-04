package com.lukeprj.board_back.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.lukeprj.board_back.common.ResponseCode;
import com.lukeprj.board_back.common.ResponseMessage;
import com.lukeprj.board_back.dto.response.ResponseDTO;

import lombok.Getter;

@Getter
public class SignUpResponseDto extends ResponseDTO{
    
    private SignUpResponseDto(){
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    }

    public static ResponseEntity<SignUpResponseDto> success(){
        SignUpResponseDto result = new SignUpResponseDto();

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDTO> duplicateEmail(){
        ResponseDTO result = new ResponseDTO(ResponseCode.DUPLICATE_EMAIL, ResponseMessage.DUPLICATE_EMAIL);
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

     public static ResponseEntity<ResponseDTO> duplicateNickname(){
        ResponseDTO result = new ResponseDTO(ResponseCode.DUPLICATE_NCIKNAME, ResponseMessage.DUPLICATE_NCIKNAME);
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

     public static ResponseEntity<ResponseDTO> duplicateTelNumber(){
        ResponseDTO result = new ResponseDTO(ResponseCode.DUPLICATE_TEL_NUMBER, ResponseMessage.DUPLICATE_TEL_NUMBER);
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}

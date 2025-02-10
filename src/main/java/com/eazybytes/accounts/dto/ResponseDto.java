package com.eazybytes.accounts.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;
    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}

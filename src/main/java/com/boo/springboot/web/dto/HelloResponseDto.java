package com.boo.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // 1. final이 없는 필드는 생성자에포함 x 2.선언된 모든 final 필드가 포함된 생성자 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;
}

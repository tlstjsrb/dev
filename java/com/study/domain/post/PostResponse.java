package com.study.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long SEQ;                           // 일련번호(PK)
    private String TITLE;                      // 제목
    private String CONTENTS;                  // 내용
    private String REGIST_USER;              // 작성자
    private String UPDATE_USER;             //수정자
    private LocalDateTime REGIST_DATE;     // 생성일
    private LocalDateTime UPDATE_DATE;    // 수정일

}
package com.study.domain.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {

    private Long SEQ;
    private String TITLE;
    private String CONTENTS;
    private String REGIST_USER;

}

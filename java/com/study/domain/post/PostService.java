package com.study.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    @Transactional
    public Long savePost(final PostRequest params) {
        postMapper.save(params);
        return params.getSEQ();
    }

    public PostRequest findPostById(final Long SEQ) {
        return postMapper.findById(SEQ);
    }

    @Transactional
    public Long updatePost(final PostRequest params) {
        postMapper.update(params);
        return params.getSEQ();
    }


    public Long deletePost(final Long SEQ) {
        postMapper.deleteById(SEQ);
        return SEQ;
    }


    public List<PostResponse> findAllPost() {
        return postMapper.findAll();
    }

}
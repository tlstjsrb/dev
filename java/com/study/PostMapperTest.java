package com.study;

import com.study.domain.post.PostMapper;
import com.study.domain.post.PostRequest;
import com.study.domain.post.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.testng.annotations.Test;

import java.util.List;

@SpringBootConfiguration
@RequiredArgsConstructor
@SpringBootTest
@Configurable
@EnableWebSecurity
public class PostMapperTest {
    PostMapper postMapper;

    @Autowired
    public PostMapperTest(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Test
    void save() {
        PostRequest params = new PostRequest();
        params.setTITLE("1번 게시글 제목");
        params.setCONTENTS("1번 게시글 내용");
        params.setREGIST_USER("테스터");
        postMapper.save(params);

        List<PostResponse> posts = postMapper.findAll();
        System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
    }

}
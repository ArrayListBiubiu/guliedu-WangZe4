package com.atguigu.eduservice.entity.vo;


import lombok.Data;
import java.util.ArrayList;
import java.util.List;


//章节
@Data
public class ChapterVo {
    private String id;
    private String title;
    //多个小节
    private List<VideoVo> children = new ArrayList<>();
}

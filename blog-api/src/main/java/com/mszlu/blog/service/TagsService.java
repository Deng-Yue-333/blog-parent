package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Tag;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagsService {


    List<TagVo> findTagsByArticleId(Long id);
}
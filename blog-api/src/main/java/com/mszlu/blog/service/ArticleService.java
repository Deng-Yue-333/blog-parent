package com.mszlu.blog.service;

import com.mszlu.blog.vo.Archive;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.params.PageParams;

import java.util.List;

public interface ArticleService {

    List<ArticleVo> listArticlesPage(PageParams pageParams);

}


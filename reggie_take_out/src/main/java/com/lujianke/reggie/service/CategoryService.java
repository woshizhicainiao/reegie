package com.lujianke.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujianke.reggie.entity.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}

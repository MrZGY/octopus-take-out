package com.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgy.octopus.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}

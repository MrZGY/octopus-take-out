package com.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgy.octopus.dto.DishDto;
import com.zgy.octopus.entity.Dish;

public interface DishService extends IService<Dish> {

    
    public void saveWithFlavor(DishDto dishDto);

    
    public DishDto getByIdWithFlavor(Long id);

    
    public void updateWithFlavor(DishDto dishDto);
}

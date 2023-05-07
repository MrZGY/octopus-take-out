package com.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgy.octopus.dto.SetmealDto;
import com.zgy.octopus.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}

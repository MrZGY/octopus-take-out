package com.zgy.octopus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgy.octopus.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

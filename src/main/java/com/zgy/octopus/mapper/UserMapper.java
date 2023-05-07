package com.zgy.octopus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgy.octopus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}

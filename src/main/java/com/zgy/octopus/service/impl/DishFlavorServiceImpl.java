package com.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgy.octopus.entity.DishFlavor;
import com.zgy.octopus.mapper.DishFlavorMapper;
import com.zgy.octopus.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}

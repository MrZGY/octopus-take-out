package com.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgy.octopus.entity.ShoppingCart;
import com.zgy.octopus.mapper.ShoppingCartMapper;
import com.zgy.octopus.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}

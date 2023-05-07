package com.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgy.octopus.entity.OrderDetail;
import com.zgy.octopus.mapper.OrderDetailMapper;
import com.zgy.octopus.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
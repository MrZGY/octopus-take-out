package com.zgy.octopus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgy.octopus.entity.Orders;

public interface OrderService extends IService<Orders> {


    public void submit(Orders orders);
}

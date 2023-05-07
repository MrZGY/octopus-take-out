package com.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgy.octopus.entity.AddressBook;
import com.zgy.octopus.mapper.AddressBookMapper;
import com.zgy.octopus.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}

package cn.ldp.ui;

import cn.ldp.factory.BeanFactory;
import cn.ldp.service.AccountService;
import cn.ldp.service.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        accountService.save();
    }
}

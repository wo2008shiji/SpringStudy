package cn.ldp.ui;

import cn.ldp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        AccountService accountService1 = applicationContext.getBean("accountService", AccountService.class);
        System.out.println(accountService == accountService1);
        ((ClassPathXmlApplicationContext) applicationContext).destroy();
        accountService.save();
    }
}

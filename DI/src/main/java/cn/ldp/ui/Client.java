package cn.ldp.ui;

import cn.ldp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
//        accountService.save();
//        AccountService accountService1 = applicationContext.getBean("accountService1", AccountService.class);
//        accountService1.save();
        AccountService accountService2 = applicationContext.getBean("accountService2", AccountService.class);
        accountService2.save();
    }
}

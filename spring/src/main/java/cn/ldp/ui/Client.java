package cn.ldp.ui;

import cn.ldp.dao.AccountDao;
import cn.ldp.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        System.out.println(accountService);
        System.out.println(accountDao);
        accountService.save();

        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        AccountService accountService1 = beanFactory.getBean("accountService", AccountService.class);
        AccountDao accountDao1 = beanFactory.getBean("accountDao", AccountDao.class);
        System.out.println(accountService1);
        System.out.println(accountDao1);

    }
}

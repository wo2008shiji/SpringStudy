package cn.ldp.service;

import cn.ldp.dao.AccountDao;
import cn.ldp.dao.AccountDaoImpl;
import cn.ldp.factory.BeanFactory;

public class AccountServiceImpl implements AccountService{
    //    private AccountDao accountDao = new AccountDaoImpl();
    private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
    @Override
    public void save() {
        accountDao.save();
    }
}

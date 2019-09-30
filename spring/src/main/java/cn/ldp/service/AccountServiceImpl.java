package cn.ldp.service;

import cn.ldp.dao.AccountDao;
import cn.ldp.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao = new AccountDaoImpl();

    @Override
    public void save() {
        accountDao.save();
    }
}

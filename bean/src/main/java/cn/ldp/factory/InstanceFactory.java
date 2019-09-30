package cn.ldp.factory;

import cn.ldp.service.AccountService;
import cn.ldp.service.AccountServiceImpl;

public class InstanceFactory {
    AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}

package cn.ldp.service;

public class AccountServiceImpl implements AccountService {

    @Override
    public void save() {
        System.out.println("service方法！");
    }
    void init(){
        System.out.println("初始化！");
    }
    void destroy(){
        System.out.println("destroy！！");
    }
}

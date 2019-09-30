package cn.ldp.service;

import java.util.Date;

public class AccountServiceImpl implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void save() {
        System.out.println("service方法！" + name + age + birthday);
    }
}

package cn.ldp.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

import static java.sql.DriverManager.*;

/**
 * 解耦合思路
 * 1.使用反射来创建对象，避免使用new
 * 2.通过读取配置文件获得全限定类名
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
//        registerDriver(new Driver());//编译依赖
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        Connection connection = getConnection("jdbc:mysql://localhost:3306/eesy?serverTimezone=GMT%2B8", "root", "root");
        //3.获取操作数据库预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account;");
        //4.执行SQL.得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        //5.遍历结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        //6.释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}

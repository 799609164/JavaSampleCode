package xxx.mybatis.annotation.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import xxx.mybatis.annotation.mapper.UserMapper;
import xxx.mybatis.annotation.model.User;

public class Test {
    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) {
        // Mybatis 配置文件
        String resource = "mybatis.cfg.xml";

        // 得到配置文件流
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建会话工厂，传入 MyBatis 的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        insertUser();
        // updateUser();
        // deleteUser();
        // selectUserById();
        // selectAllUser();
    }

    // 新增用户
    private static void insertUser(){
        // 通过工厂得到 SqlSession
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setName("Anne");
        user.setSex("female");
        user.setAge(23);
        try {
            mapper.insertUser(user);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        // 释放资源
        session.close();
    }

    // 将 id 为 1 的用户的年龄更新为 25
    private static void updateUser(){
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = null;
        try {
            user = mapper.selectUserById(1);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        user.setAge(25);
        try {
            mapper.updateUser(user);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }

    // 将 id 为 5 的用户删除
    private static void deleteUser(){
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(5);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }

    // 查询 id 为 1 的用户信息
    private static void selectUserById(){
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            User user = mapper.selectUserById(1);
            session.commit();
            System.out.println(user.getId() + " " + user.getName()  + " " + user.getSex() + " "
                    + user.getAge());
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }

    // 查询所有用户信息
    private static void selectAllUser(){
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            List<User> userList = mapper.selectAllUser();
            session.commit();
            for (User user : userList) {
                System.out.println(user.getId() + " " + user.getName()  + " " + user.getSex() + " "
                        + user.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }
}
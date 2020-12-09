package org.sxs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.sxs.mapper.GoodsMapper;
import org.sxs.pojo.Goods;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: SupplierTest
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/9 15:56
 * @Version: V1.0
 */
public class GoodsTest {
    @Test
    public void show(){
        //1、读取配置文件
        String config = "mybatis-cfg.xml";
        try {
            //文件输入流对象
            InputStream is = Resources.getResourceAsStream(config);
            //2、创建SqlSessionFactory对象，读取配置文件
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            // 3、创建SqlSession对象
            SqlSession session = factory.openSession();
            //4、调用接口中的方法
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
            List<Goods> list = mapper.all();

            for (Goods goods:list){
                System.out.println(goods);
            }
            //关闭会话
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加
     */
    @Test
    public void add(){
        //1、读取配置文件
        String config = "mybatis-cfg.xml";
        try {
            //文件输入流对象
            InputStream is = Resources.getResourceAsStream(config);
            //2、创建SqlSessionFactory对象，读取配置文件
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            // 3、创建SqlSession对象
            SqlSession session = factory.openSession();
            //封装对象

            Goods goods = new Goods("AA001", "美式大面包", "19.90", "袋", "GY0001", 200);
            //4、调用接口中的方法
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
           int count =mapper.add(goods) ;

           //添加，删除，修改必须提交
             session.commit();

            //5、关闭会话
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改
     */
    @Test
    public void update(){
        //1、读取配置文件
        String config = "mybatis-cfg.xml";
        try {
            //文件输入流对象
            InputStream is = Resources.getResourceAsStream(config);
            //2、创建SqlSessionFactory对象，读取配置文件
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            // 3、创建SqlSession对象
            SqlSession session = factory.openSession();

            //封装对象
            Goods goods = new Goods("AA001", "美式大面包", "30.90", "个", "GY0001", 300);
            //4、调用接口中的方法
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
            int count = mapper.udate(goods);

            //添加，删除，修改必须提交
            session.commit();

            //5、关闭会话
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除
     */
    @Test
    public void delete(){
        //1、读取配置文件
        String config = "mybatis-cfg.xml";
        try {
            //文件输入流对象
            InputStream is = Resources.getResourceAsStream(config);
            //2、创建SqlSessionFactory对象，读取配置文件
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            // 3、创建SqlSession对象
            SqlSession session = factory.openSession();

            //4、调用接口中的方法
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
            int count = mapper.lete("AA001");

            //添加，删除，修改必须提交
            session.commit();

            //5、关闭会话
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}


package org.sxs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.sxs.pojo.Supplier;

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
public class SupplierTest {
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
            //4、调用mapper文件进行数据操作
            List<Supplier> list = session.selectList("org.sxs.dao.SupplierMapper.all");
            for (Supplier supplier:list){
                System.out.println(supplier);
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
            Supplier supplier = new Supplier("CC0001", "盼盼食品有限公司", "李四", "15877490678", "湖北武汉", "51616516", "饼干面包供应商");
            //4、调用mapper文件进行数据操作
           int count = session.insert("org.sxs.dao.SupplierMapper.add",supplier);

           //添加，删除，修改必须提交
             session.commit();

            //关闭会话
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
            Supplier supplier = new Supplier("CC0001", "盼盼食品有限公司", "李五", "15877490678", "南京", "51616516", "牛奶面包供应商");
            //4、调用mapper文件进行数据操作
            int count = session.update("org.sxs.dao.SupplierMapper.udate",supplier);

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

            //4、调用mapper文件进行数据操作
            int count = session.delete("org.sxs.dao.SupplierMapper.lete","CC0001");

            //添加，删除，修改必须提交
            session.commit();

            //5、关闭会话
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}


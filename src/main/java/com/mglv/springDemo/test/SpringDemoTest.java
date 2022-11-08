package com.mglv.springDemo.test;

import com.mglv.springDemo.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Description:
 * @Author: MG LV
 * @Date: 11:26 PM 11/7/2022
 * @version: 1.0
 */

public class SpringDemoTest {
    public static void main(String[] args) {
        // 创建 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // 加载配置文件
        reader.loadBeanDefinitions("beans.xml");
        // 获取 Bean 实例
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
    }
}

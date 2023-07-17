package org.example.test.ioc;

import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.example.test.ioc.service.HelloService;
import org.junit.Test;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception {
        //创建bean容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建bean对象对应的BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        //注册bean
        beanFactory.registerBeanDefinition("helloService", beanDefinition);
        //获取bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        //调用bean方法
        helloService.sayHello();
    }
}

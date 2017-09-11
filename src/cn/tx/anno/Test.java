package cn.tx.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王炳智 on 2017/8/25.
 */
//使用注解的方式实现事务
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("Bean1.xml");
        Service service = (Service) ctx.getBean("service");
        service.zhuanzhang();

    }
}

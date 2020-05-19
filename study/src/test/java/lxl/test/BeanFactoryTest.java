package lxl.test;

import lxl.test.beans.BeanDefinition;
import lxl.test.beans.factory.BeanFactory;
import lxl.test.beans.factory.support.DefaultBeanFactory;
import lxl.test.beans.factory.xml.XmlBeanDefinitionReader;
import lxl.test.service.TestService;
import org.junit.Assert;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void testGetBean() {

//        ClassLoader cl = ClassLoader.getSystemClassLoader();
//        URL url = cl.getResource("test-v1.xml");
//        System.out.println("url:"+url);
//        System.out.println("urlPath:"+url.getPath());

        DefaultBeanFactory beanFactory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinition("test-v1.xml");

        BeanDefinition bd = beanFactory.getBeanDefinition("testService");

        Assert.assertEquals("lxl.test.service.TestService",bd.getBeanClassName());

        TestService testService = (TestService) beanFactory.getBean("testService");

        Assert.assertNotNull(testService);

    }

}

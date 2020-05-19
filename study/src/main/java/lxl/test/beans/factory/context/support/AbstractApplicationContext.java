package lxl.test.beans.factory.context.support;

import lxl.test.beans.factory.context.ApplicationContext;
import lxl.test.beans.factory.support.DefaultBeanFactory;
import lxl.test.beans.factory.xml.XmlBeanDefinitionReader;

import javax.annotation.Resource;

public abstract class AbstractApplicationContext implements ApplicationContext {

    private DefaultBeanFactory beanFactory;

    public AbstractApplicationContext(String configFile) {
        beanFactory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        Resource resource = new
        reader.loadBeanDefinition(configFile);
    }

}

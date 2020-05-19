package lxl.test.beans.factory.context.support;

import lxl.test.beans.BeanDefinition;
import lxl.test.beans.factory.context.ApplicationContext;

public class FileSystemXmlApplicationContext implements ApplicationContext {
    @Override
    public void setBeanClassLoader(ClassLoader beanClassLoader) {

    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return null;
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanID) {
        return null;
    }

    @Override
    public Object getBean(String beanID) {
        return null;
    }
}

package lxl.test.beans.factory.support;

import lxl.test.ClassUtils;
import lxl.test.beans.factory.BeanFactory;
import lxl.test.beans.BeanDefinition;
import lxl.test.beans.factory.config.ConfigurableBeanFactory;
import lxl.test.exception.BeanCreationException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultBeanFactory implements BeanFactory,BeanDefinitionRegistry, ConfigurableBeanFactory {

    private final Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    private ClassLoader beanClassLoader;

    public DefaultBeanFactory() {

    }

    @Override
    public BeanDefinition getBeanDefinition(String beanID) {
        return this.beanDefinitionMap.get(beanID);
    }

    @Override
    public void registerBeanDefinition(String beanID, BeanDefinition bd) {
        this.beanDefinitionMap.put(beanID,bd);
    }

    @Override
    public Object getBean(String beanID) {

        BeanDefinition bd = this.getBeanDefinition(beanID);
        if(bd == null) {
            throw new BeanCreationException("Bean Definition does not exist");
        }

        ClassLoader classLoader = this.getBeanClassLoader();
        String beanClassName = bd.getBeanClassName();
        try {
            Class<?> clazz = classLoader.loadClass(beanClassName);
            return clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.beanClassLoader = beanClassLoader;
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return (this.beanClassLoader != null?this.beanClassLoader:ClassUtils.getDefaultClassLoader());
    }
}

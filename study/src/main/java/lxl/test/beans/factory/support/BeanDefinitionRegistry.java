package lxl.test.beans.factory.support;

import lxl.test.beans.BeanDefinition;

public interface BeanDefinitionRegistry {

    BeanDefinition getBeanDefinition(String beanID);
    void registerBeanDefinition(String beanID,BeanDefinition bd);

}

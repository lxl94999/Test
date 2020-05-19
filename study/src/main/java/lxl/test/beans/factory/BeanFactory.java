package lxl.test.beans.factory;

import lxl.test.beans.BeanDefinition;

public interface BeanFactory {

    BeanDefinition getBeanDefinition(String beanID);

    Object getBean(String beanID);

}

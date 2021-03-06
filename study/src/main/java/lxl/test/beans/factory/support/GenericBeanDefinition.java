package lxl.test.beans.factory.support;

import lxl.test.beans.BeanDefinition;

public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String beanClassName;

    public GenericBeanDefinition(String id,String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return this.beanClassName;
    }
}

package lxl.test.exception;

public class BeanCreationException extends BeansException {

    private String beanName;

    public BeanCreationException(String msg) {
        super(msg);
    }

    public BeanCreationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BeanCreationException(String beanName,String msg) {
        super("Error creating bean with name '"+ beanName + "':" +msg);
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}

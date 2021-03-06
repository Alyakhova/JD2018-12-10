package by.it.subach.jd01_10;


import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {


        Class<?> beanClass = Bean.class;
        Object instance = beanClass.getDeclaredConstructor().newInstance();
        Bean b1 = (Bean) instance;
        Method[] methods = beanClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                Param annotation = method.getAnnotation(Param.class);
                System.out.println(method.getName() + " " + method.invoke(b1, annotation.a(), annotation.b()));

            }
        }

    }

}
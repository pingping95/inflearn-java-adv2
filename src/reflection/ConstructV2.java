package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstructV2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String className = "reflection.data.BasicData";
        Class<?> aClass = Class.forName(className);

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);

        Object instance = constructor.newInstance("hello");
        System.out.println("Instance = " + instance);

        Method method1 = aClass.getDeclaredMethod("call");
        method1.invoke(instance);

    }

}

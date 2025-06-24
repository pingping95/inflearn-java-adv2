package reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {
    public static void main(String[] args) throws ClassNotFoundException {

        String className = "reflection.data.BasicData";
        Class<?> aClass = Class.forName(className);

        System.out.println("====== constructors() =====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("====== declaredConstructors() =====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
    }

}

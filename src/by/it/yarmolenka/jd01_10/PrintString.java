package by.it.yarmolenka.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            int modifiers = declaredMethod.getModifiers();
            String name = declaredMethod.getName();
            if (!Modifier.isStatic(modifiers)) System.out.println(name);
        }
    }
}

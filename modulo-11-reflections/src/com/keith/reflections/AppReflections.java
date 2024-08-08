package com.keith.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] args) {
        Class clazz = Produto.class;

        System.out.println( clazz);

        Produto produto = new Produto();
        Class clazz2 = produto.getClass();
        System.out.println(clazz2);
        System.out.println();

        try {
            Constructor construct = clazz.getConstructor();
            System.out.println(construct);
            Produto produto2 = (Produto) construct.newInstance();
            System.out.println(produto2);
            System.out.println();
            Field[] fields = produto2.getClass().getDeclaredFields();
            for (Field field : fields) {
                Class<?> tipo = field.getType();
                System.out.println(tipo);
                String nome = field.getName();
                System.out.println(nome);
            }
            System.out.println();
            Method[] methods = produto2.getClass().getDeclaredMethods();
            for (Method method : methods) {
                Class<?> tipo = method.getReturnType();
                System.out.println(tipo);
                String nome = method.getName();
                System.out.println(nome);
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}

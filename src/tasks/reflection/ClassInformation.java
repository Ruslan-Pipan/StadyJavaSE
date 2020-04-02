package tasks.reflection;

import java.lang.reflect.*;

public class ClassInformation {
    private Class aClass;
    private Field[] fields;
    private Constructor[] constructors ;
    private Method[] methods;
    private Method enclosingMethod;

    public ClassInformation(String nameClass) {
        try {
            aClass = Class.forName(nameClass);
            fields = aClass.getDeclaredFields();
            constructors = aClass.getDeclaredConstructors();
            methods = aClass.getDeclaredMethods();
            enclosingMethod = aClass.getEnclosingMethod();
        } catch (ClassNotFoundException e) {
            System.out.println(nameClass + " is not fount (");
        }
    }

    public void printInformationAboutClass(){
        System.out.println("\t\t Information about: " + aClass.getSimpleName());
        printInformationClass();
        System.out.println("\t\t Filds: " + fields.length);
        printInformationFiels();
        System.out.println("\t\t Metods: " + methods.length);
        printInformationMetods();
        System.out.println("\t\t Constuctors: " + constructors.length);
        printInformationConstructor();
    }

    private void printInformationClass(){
        Class superClass = aClass.getSuperclass();
        System.out.println("It's : " + aClass.toGenericString());
        System.out.println("Super Class: " + superClass.getSimpleName());
    }

    private void printInformationFiels(){
        Type type;
        for (int i = 0; i < fields.length; i++){
            type = fields[i].getType();
            System.out.println("\tField name: " + fields[i].getName());
            System.out.println("Modifiers: " + Modifier.toString(fields[i].getModifiers()));
            System.out.println("Type: " + type.getTypeName());
            System.out.println();
        }
    }

    private void printInformationMetods(){
        Type returnTypes;
        Type[] parametrTypes;
        for (int i = 0; i < methods.length; i++){
            returnTypes = methods[i].getReturnType();
            parametrTypes = methods[i].getParameterTypes();
            System.out.println("\tMethods name: " + methods[i].getName());
            System.out.println("Modifiers: " + Modifier.toString(methods[i].getModifiers()));
            System.out.println("Return type: " + returnTypes.getTypeName());
            System.out.print("Parametr type: " );
            for (int j = 0; j < parametrTypes.length; j++)
                System.out.print(parametrTypes[j].getTypeName());
            System.out.println("\n");
        }
    }

    private void printInformationConstructor(){
        Type[] paramtrType;
        for (int i = 0; i < constructors.length; i++){
            paramtrType = constructors[i].getParameterTypes();
            System.out.println("Constructor name: " + constructors[i].getName());
            System.out.print("Parametrs: ");
            for (int j = 0; j < paramtrType.length; j++)
                System.out.print(paramtrType[j].getTypeName() + " ");
            System.out.println("\n");
        }
    }

}

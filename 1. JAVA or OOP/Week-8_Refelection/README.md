# Reflection
Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.\
With reflection we can invoke methods at runtime irrespective of the access specifier used with them.

# API
Class The getClass() method
Constructors The getConstructors() method
Methods The getMethods() 

## Method Invocation
We can invoke an method with reflection if we know its name and parameter types. 
We use below two methods for this purpose getDeclaredMethod() & Invoke()

## Example
```java
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflection {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		Class clazz = myClass.getClass();
		System.out.println(clazz.getName());
		
        // method invocation
		try {
			Method myMethod = clazz.getDeclaredMethod("printMe", String.class);
			myMethod.invoke(myClass, "myStr");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | 
				 IllegalArgumentException | InvocationTargetException e) {			
			e.printStackTrace();
		}
        //access Private Field
        try {
                    Method myMethod = clazz.getDeclaredMethod("printMe", String.class);
                    myMethod.setAccessible(true);
                    myMethod.invoke(myClass, "myStr");
                    
                    Field field = clazz.getDeclaredField("num");
                    field.setAccessible(true);
                    System.out.println("private field name:" + field.getName() + " Value:" + field.get(myClass));
                } catch (NoSuchMethodException | SecurityException | IllegalAccessException | 
                        IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {			
                    e.printStackTrace();
                }
        }
}

public class MyClass {
	private int num = 0;
	
	public MyClass() {
		this.num=5;
	}
	
	public MyClass(int num) {
		this.num=num;
	}
	
	public MyClass(int num, int p) {
		this.num=num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void printMe(String str) {
		System.out.println("printMe method was called: " + str);
	}
}
```
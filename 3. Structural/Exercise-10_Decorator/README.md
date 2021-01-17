# Decorator
Attach additional responsibilities to an object dynamically. Decorators provide a
flexible alternative to subclassing for extending functionality.

Specific composite(in composite the operation is general)
```java
//decoretor
public void operation(){
    component.operation();
    this.privateOperation();
}
```

![class-diagram](decoretor.png)
package lwy.study.spring.aop;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, @Nullable Object[] args, @Nullable Object target)
            throws Throwable {
        System.out.println("登陆前通知！");
        System.out.println(method.getName());
        System.out.println(method.getReturnType());
        for (Object o : args) {
            System.out.println(o);
        }
        System.out.println(target.toString());
    }
}

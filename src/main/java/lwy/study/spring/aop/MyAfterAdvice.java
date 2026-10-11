package lwy.study.spring.aop;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(
            @Nullable Object returnValue, Method method,
            @Nullable Object[] args,
            @Nullable Object target) throws Throwable {
        System.out.println("登陆后通知！");
        System.out.println(returnValue);
    }
}

package com.jackiew.mvc.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Objects;

@Component
public class SecurityIntercepter implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            throw new IllegalArgumentException("this intercepter is only compatile with handler method");
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Spy spyAnnotation = method.getDeclaredAnnotation(Spy.class);
        if (Objects.isNull(spyAnnotation)) {
            return true;
        }
        if (StringUtils.isBlank(spyAnnotation.resourceId())) {
            return true;
        }
        String resourceId = spyAnnotation.resourceId();
        //get current user's id
        //get user's current spy list
        //check whether this spy list contains the specified resourceId

        return false;
    }
}

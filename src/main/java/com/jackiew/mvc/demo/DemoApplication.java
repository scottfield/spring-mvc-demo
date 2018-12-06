package com.jackiew.mvc.demo;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Config.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispatcherServlet.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/app/*", "/test/*"};
    }
}

package com.example.springbootconfig.beans;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class MyViewResolver implements ViewResolver
{
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        return null;
    }
}

package com.i18n.Internationalization.controller;

import com.i18n.Internationalization.translator.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterController {

    @Autowired
    MessageSource messageSource;

    @RequestMapping("/getMsg")
    public String get()
    {

        //return Translator.toLocale("welcome");
        return messageSource.getMessage("welcome",null, LocaleContextHolder.getLocale());
    }

}

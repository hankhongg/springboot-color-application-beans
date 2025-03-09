package com.get_to_know_beans.ColorApplication.config;

import com.get_to_know_beans.ColorApplication.services.BluePrinter;
import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.PinkPrinter;
import com.get_to_know_beans.ColorApplication.services.RedPrinter;
import com.get_to_know_beans.ColorApplication.services.impl.ColorPrinterImpl;
import com.get_to_know_beans.ColorApplication.services.impl.JapaneseBluePrinter;
import com.get_to_know_beans.ColorApplication.services.impl.JapaneseRedPrinter;
import com.get_to_know_beans.ColorApplication.services.impl.JapanesePinkPrinter;
import com.get_to_know_beans.ColorApplication.services.impl.EnglishBluePrinter;
import com.get_to_know_beans.ColorApplication.services.impl.EnglishPinkPrinter;
import com.get_to_know_beans.ColorApplication.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // remember to put configuration here
public class colorConfig {
    @Bean
    public BluePrinter bluePrinter() {
        return new JapaneseBluePrinter();
    }
    @Bean
    public PinkPrinter pinkPrinter() {
        return new JapanesePinkPrinter();
    }
    @Bean
    public RedPrinter redPrinter() {
        return new JapaneseRedPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, PinkPrinter pinkPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redPrinter,  bluePrinter,pinkPrinter);
    }
}

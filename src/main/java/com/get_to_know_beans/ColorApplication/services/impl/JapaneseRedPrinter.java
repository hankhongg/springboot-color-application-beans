package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.RedPrinter;
import org.springframework.stereotype.Component;
// JapaneseRedPrinter implements RedPrinter => JapaneseRedPrinter can be seen as RedPrinter
@Component
public class JapaneseRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "赤い";
    }
}

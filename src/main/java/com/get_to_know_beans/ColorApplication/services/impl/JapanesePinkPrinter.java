package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.PinkPrinter;
import org.springframework.stereotype.Component;
// JapanesePinkPrinter implements PinkPrinter => JapanesePinkPrinter can be seen as PinkPrinter
@Component
public class JapanesePinkPrinter implements PinkPrinter {
    @Override
    public String print(){
        return "ピンク";
    }
}

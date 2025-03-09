package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.RedPrinter;

public class JapaneseRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "赤い";
    }
}

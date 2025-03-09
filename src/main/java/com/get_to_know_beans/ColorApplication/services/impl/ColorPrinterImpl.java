package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.BluePrinter;
import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.PinkPrinter;
import com.get_to_know_beans.ColorApplication.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private PinkPrinter pinkPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, PinkPrinter pinkPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.pinkPrinter = pinkPrinter;
    }
    @Override
    public String print(){
        return redPrinter.print() + " " + bluePrinter.print() + " " + pinkPrinter.print();
    }
}

package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.BluePrinter;
import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.PinkPrinter;
import com.get_to_know_beans.ColorApplication.services.RedPrinter;
import org.springframework.stereotype.Component;
// ya run => bug: sth is missing => declare it as @Component as default method ya wanna use

// NOTE: the compiler looks for ColorPrinter but here the ColorPrinterImpl implements ColorPrinter so we can use ColorPrinterImpl insted

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private PinkPrinter pinkPrinter;
// => declare @Component for the DEFAULT (AKA WANTED) RedPrinter/BluePrinter/PinkPrinter
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

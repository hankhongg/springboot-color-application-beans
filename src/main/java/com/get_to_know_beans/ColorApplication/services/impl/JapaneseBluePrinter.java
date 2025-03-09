package com.get_to_know_beans.ColorApplication.services.impl;

import com.get_to_know_beans.ColorApplication.services.BluePrinter;
import org.springframework.stereotype.Component;
// JapaneseBluePrinter implements BluePrinter => JapaneseBluePrinter can be seen as BluePrinter
@Component
public class JapaneseBluePrinter implements BluePrinter {
    @Override
    public String print(){
        return "青い";
    }
}

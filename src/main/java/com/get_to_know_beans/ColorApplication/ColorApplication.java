package com.get_to_know_beans.ColorApplication;

import com.get_to_know_beans.ColorApplication.services.ColorPrinter;
import com.get_to_know_beans.ColorApplication.services.impl.ColorPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@Log
@SpringBootApplication
public class ColorApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}
	@Override
	public void run(String...args){
		final ColorPrinter colorPrinter = new ColorPrinterImpl();
		log.info(colorPrinter.print());
	}
}

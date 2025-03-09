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
	private ColorPrinter colorPrinter;
	public ColorApplication(ColorPrinter colorPrinter) { // gotta declare it inside "beans" per se configuration class
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}
	@Override
	public void run(String...args){
		log.info(colorPrinter.print());
	}
}

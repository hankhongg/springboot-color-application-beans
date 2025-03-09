package com.get_to_know_beans.ColorApplication;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

// DON'T MIND THE APPLICATION'S NAME, IT HAS NOTHING TO DO WITH THIS BRANCH
@Log
@SpringBootApplication
public class ColorApplication {
	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}
}

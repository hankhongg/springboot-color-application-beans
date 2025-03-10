package com.get_to_know_beans.ColorApplication;

import com.get_to_know_beans.ColorApplication.services.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class PizzaApplication implements CommandLineRunner {
	private PizzaConfig pizzaConfig;
	public PizzaApplication(PizzaConfig pizzaConfig) { // gotta declare it inside "beans" per se configuration class
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}
	@Override
	public void run(String... args) {
		log.info(String.format(
				"I want a pizza. Which has the %s sauce, %s cheese and %s crust!",
				pizzaConfig.getSauce(), pizzaConfig.getCheese(), pizzaConfig.getCrust())
		);
	}
}

package com.get_to_know_beans.ColorApplication.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // mark this as a Spring configuration class (then Spring comes look at it)
@ConfigurationProperties(prefix="pizza") // example: pizza.crust="stuffed"
@NoArgsConstructor
@AllArgsConstructor
@Data // this does the Getter() and Setter(), @RequiredArgsConstructor..etc for us
public class PizzaConfig {
    String sauce;
    String cheese;
    String crust;
}

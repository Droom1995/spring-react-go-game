

package com.mancala.boot;

import com.mancala.controller.ControllerConfig;
import com.mancala.model.ModelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Oleksandr Husiev on 8/12/2018.
 */
@SpringBootApplication
@Import({ControllerConfig.class, ModelConfig.class})
public class VaadinApplication {

    public static void main(String[] args){
        SpringApplication.run(VaadinApplication.class, args);
    }
}

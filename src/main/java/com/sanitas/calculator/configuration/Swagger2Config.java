package com.sanitas.calculator.configuration;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger configuration
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * Api docket.
     *
     * @return the docket
     */
    @Bean
    public static Docket api() {

        ApiInfo apiInfo = new ApiInfo(
            "Calculator",
            "Calculator API",
            "1.0.0",
            "",
            new Contact("Jaime Delgado Linares", "http://linkedin.com/in/jaimedelgado1", "jaimedl92@gmail.com"),
            "GNU General Public License v3.0",
            "https://www.gnu.org/licenses/gpl-3.0.html",
            new ArrayList<>());

        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.sanitas.calculator.controller"))
            .paths(PathSelectors.regex("/.*"))
            .build();
    }

}
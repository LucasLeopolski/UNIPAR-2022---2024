package org.unipar.progamacaoWeb.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SweggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Resort Unipar - Rest API")
                        .description("API para um aplicativo de controle de reservas de um resort." +
                                " Trabalho de Programação para Internet," +
                                " Curso de Análise e Desenvolvimento de Sistemas," +
                                " Universidade Paranaense - UNIPAR." +
                                " Valor: 3.0")
                        .version("1.0")
                ).externalDocs(
                        new ExternalDocumentation()
                                .description("Unipar")
                                .url("http://www.unipar.br"));
    }
}

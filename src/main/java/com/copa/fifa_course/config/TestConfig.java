package com.copa.fifa_course.config;

import com.copa.fifa_course.entities.Selecao;
import com.copa.fifa_course.repository.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private SelecaoRepository selecaoRepository;

    @Override
    public void run(String... args) throws Exception {
        Selecao sl1 = new Selecao(null, "Equador", "America Do Sul");
        Selecao sl2 = new Selecao(null, "Suiça", "Europa");

        selecaoRepository.saveAll(Arrays.asList(sl1, sl2));

    }
}

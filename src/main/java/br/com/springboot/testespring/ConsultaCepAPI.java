package br.com.springboot.testespring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/consulta")
public class ConsultaCepAPI {


    @GetMapping("/cep/{cep}")
    public String buscaCEP(@PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = String.format("https://viacep.com.br/ws/%s/json/",cep);
        System.out.println("URL MODIFICADA: "+apiUrl);
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return response.getBody();
    }
}

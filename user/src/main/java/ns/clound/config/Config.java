package ns.clound.config;


import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public TomcatServletWebServerFactory  tomcat(){
        TomcatServletWebServerFactory  tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(5000);
        return tomcat;
    }

    @Bean
    public RestTemplate  restTemplate(){
        RestTemplate  restTemplate   = new RestTemplate();
        return restTemplate;
    }
}

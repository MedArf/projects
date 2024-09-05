package configuration;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder, SslBundles sslBundles) {
        // Retrieve the SSL bundle for the client
        SslBundle sslBundle = sslBundles.getBundle("mybundle");

        // Configure RestTemplate with the SSL bundle
        return restTemplateBuilder
                .setSslBundle(sslBundle)
                .build();
    }
}

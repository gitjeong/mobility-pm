package mobility.pm.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
public class DataSourceConfig {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

}

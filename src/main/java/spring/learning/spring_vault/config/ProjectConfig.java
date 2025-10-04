package spring.learning.spring_vault.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {
    @Value("${custom.datasource.url}")
    private String dataSourceUrl;

    @Value("${custom.datasource.password}")
    private String dataSourcePassword;

    @Value("${custom.datasource.username}")
    private String dataSourceUserName;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dataSourceUrl);
        dataSource.setUsername(dataSourceUserName);
        dataSource.setPassword(dataSourcePassword);
        dataSource.setConnectionTimeout(30000);
        return dataSource;
    }
}

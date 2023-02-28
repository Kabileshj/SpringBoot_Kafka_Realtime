package springboot_kafka_consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("springboot_kafka_consumer.repo")
public class JpaConfig {
}
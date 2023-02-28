package springboot_kafka_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot_kafka_producer.service.KafkaProducerService;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Override
    public void run(String... args) throws Exception {
        kafkaProducerService.sendMessage();
    }
}
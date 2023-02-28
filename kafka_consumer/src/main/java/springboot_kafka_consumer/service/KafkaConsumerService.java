package springboot_kafka_consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import springboot_kafka_consumer.repo.DataRepository;

@Service
public class KafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

    private DataRepository dataRepository;

    public KafkaConsumerService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(
            topics = "realtime",
            groupId = "myGroup"
    )
    public void consume(String msg) {
        LOGGER.info(String.format("Event message received -> %s", msg));

//        Data data = new Data();
//        data.setData(msg);
//        dataRepository.save(data);
    }
}

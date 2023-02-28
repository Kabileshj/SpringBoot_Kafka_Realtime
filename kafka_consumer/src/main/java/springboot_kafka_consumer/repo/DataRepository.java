package springboot_kafka_consumer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot_kafka_consumer.dao.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
}

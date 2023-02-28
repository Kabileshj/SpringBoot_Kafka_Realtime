package springboot_kafka_consumer.dao;

import javax.persistence.*;

@Entity
@Table(name = "Data")
@lombok.Data

public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String data;
}
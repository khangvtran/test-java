import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;


public class Producer {
    private int val1 = 9999;
    private final KafkaProducer<String, String> producer; // declare



    public Producer(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer(properties); // assign

    }

    public void sendMessage(String message){
        try {
            ProducerRecord<String, String> producerRecord = new ProducerRecord<>("quickstart-events", "quickstart-events", message);
            this.producer.send(producerRecord);


//        this.producer.send(new ProducerRecord<>("quickstart-events", "quickstart-events", message));
//        System.out.println(this.val1);

        }  catch (Exception e){
            e.printStackTrace();
        }

    }
}

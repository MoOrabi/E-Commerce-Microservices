package org.moorabi.ecommerce.kafka.order;

public record Customer(
        String id,
        String name,
        int age
) {

}
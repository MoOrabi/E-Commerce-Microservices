package com.moorabi.ecommerce.payment;

import com.moorabi.ecommerce.customer.CustomerResponse;
import com.moorabi.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}

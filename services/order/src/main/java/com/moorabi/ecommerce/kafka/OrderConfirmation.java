package com.moorabi.ecommerce.kafka;

import com.moorabi.ecommerce.customer.CustomerResponse;
import com.moorabi.ecommerce.order.PaymentMethod;
import com.moorabi.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}

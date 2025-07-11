package com.moorabi.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer lastName is required")
        String lastname,
        @NotNull(message = "Customer email is required")
        @Email(message = "Customer email is invalid")
        String email,
        Address address
) {
}

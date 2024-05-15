package com.miguel.springboot.app.springbootcrudsecurity;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.miguel.springboot.app.springbootcrudsecurity.entities.Product;

@Component
public class ProductValidation implements Validator {

    @Override
    public boolean supports(@SuppressWarnings("null") Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @SuppressWarnings("null")
    @Override
    public void validate(@SuppressWarnings("null") Object target, @SuppressWarnings("null") Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "Es requerido");
        // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotBlank.product.description");
        if(product.getDescription() == null || product.getDescription().isBlank()){
            errors.rejectValue("description", null, "Es requerido, por favor");
        }

        if(product.getPrice() == null){
            errors.rejectValue("price", null, "No puede ser nulo.");
        } else if(product.getPrice() < 500){
            errors.rejectValue("price", null,  "Debe ser mayor o igual a 500");
        }
    }
    
}

package com.ensa.msproduct.entities;


import javax.persistence.*;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("product")
public class Product {
    @Id
    private Long id;
    private String designation;
    private Double price;
    private Long depositQuantity;

    private String photo;
    private Date expiryDate;

    private String description;




}

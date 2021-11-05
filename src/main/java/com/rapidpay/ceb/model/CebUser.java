package com.rapidpay.ceb.model;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ceb_user")
public class CebUser implements Serializable {

    @Id
    private int accountNumber;
    private String name;
    private String address;
    private String nic;
    private String other;
}

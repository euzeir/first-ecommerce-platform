package com.euris.firstecommerceplatform.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userId", nullable = false, updatable = false)
    private Long userId;
    private String userName;
    private String userSurname;
    private String userEmail;
    private Date userBirthday;
    private LocalDateTime userCreationDate;
    private LocalDateTime userLastModificationDate;

    @OneToMany(targetEntity = InvoiceHeader.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "userInvoiceHeaderFK", referencedColumnName = "userId")
    private List<InvoiceHeader> invoiceHeaders;
}

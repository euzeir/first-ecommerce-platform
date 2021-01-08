package com.euris.firstecommerceplatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class InvoiceHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceId;
    private Long userId;
    private Long invoiceTotal;

    @OneToMany(targetEntity = InvoiceRows.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "invoiceHeaderInvoiceRowsFK", referencedColumnName = "invoiceId")
    private List<InvoiceRows> invoiceRowsList;
}

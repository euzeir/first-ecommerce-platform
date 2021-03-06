package com.euris.firstecommerceplatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String itemName;
    private String itemDescription;
    private Long itemPrice;
    private String itemCategory;
    private LocalDateTime itemCreationDate;
    private LocalDateTime itemLastModificationDate;

    @OneToMany(targetEntity = InvoiceRows.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "itemInvoiceRowsFK", referencedColumnName = "itemId")
    private List<InvoiceRows> invoiceRowsList;

}

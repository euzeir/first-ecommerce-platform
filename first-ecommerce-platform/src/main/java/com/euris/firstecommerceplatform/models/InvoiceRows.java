package com.euris.firstecommerceplatform.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class InvoiceRows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rowId;
    private Long invoiceId;
    private Long itemId;
    private Long itemQuantity;
    private Long itemSubtotalPrice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "invoiceId", nullable = false, insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private InvoiceHeader invoiceHeader;
}

package com.euris.firstecommerceplatform.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer userId;
    private Integer itemId;
    private String  itemName;
    private Integer itemSubtotalPrice;
    private Integer itemQuantity;
    private Integer itemTotalPrice;
    private LocalDateTime orderCreationDate;
    private LocalDateTime orderLastModificationDate;

    @ManyToMany(mappedBy = "orders")
    private List<User> users;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getitemSubtotalPrice() {
        return itemSubtotalPrice;
    }

    public void setitemSubtotalPrice(Integer itemSubtotalPrice) {
        this.itemSubtotalPrice = itemSubtotalPrice;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Integer getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(Integer itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    public LocalDateTime getOrderCreationDate() {
        return orderCreationDate;
    }

    public void setOrderCreationDate(LocalDateTime orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }

    public LocalDateTime getOrderLastModificationDate() {
        return orderLastModificationDate;
    }

    public void setOrderLastModificationDate(LocalDateTime orderLastModificationDate) {
        this.orderLastModificationDate = orderLastModificationDate;
    }
}

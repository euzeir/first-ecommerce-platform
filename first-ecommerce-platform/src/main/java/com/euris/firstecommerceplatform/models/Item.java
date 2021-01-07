package com.euris.firstecommerceplatform.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private String itemName;
    private String itemDescription;
    private Integer itemPrice;

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    private String itemCategory;
    private LocalDateTime itemCreationDate;
    private LocalDateTime itemLastModificationDate;

    public Item() {
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

    public String getitemDescription() {
        return itemDescription;
    }

    public void setitemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public LocalDateTime getItemCreationDate() {
        return itemCreationDate;
    }

    public void setItemCreationDate(LocalDateTime itemCreationDate) {
        this.itemCreationDate = itemCreationDate;
    }

    public LocalDateTime getItemLastModificationDate() {
        return itemLastModificationDate;
    }

    public void setItemLastModificationDate(LocalDateTime itemLastModificationDate) {
        this.itemLastModificationDate = itemLastModificationDate;
    }
}

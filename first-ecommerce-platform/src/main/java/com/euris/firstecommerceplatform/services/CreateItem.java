package com.euris.firstecommerceplatform.services;

import com.euris.firstecommerceplatform.models.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateItem {
    private Item item;
}

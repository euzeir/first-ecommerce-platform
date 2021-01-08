package com.euris.firstecommerceplatform.repositories;

import com.euris.firstecommerceplatform.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

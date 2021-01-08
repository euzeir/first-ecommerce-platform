package com.euris.firstecommerceplatform.repositories;

import com.euris.firstecommerceplatform.models.InvoiceRows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRowsRepository extends JpaRepository<InvoiceRows, Long> {
}

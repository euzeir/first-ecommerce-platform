package com.euris.firstecommerceplatform.repositories;

import com.euris.firstecommerceplatform.models.InvoiceHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceHeaderRepository extends JpaRepository<InvoiceHeader, Long> {
}

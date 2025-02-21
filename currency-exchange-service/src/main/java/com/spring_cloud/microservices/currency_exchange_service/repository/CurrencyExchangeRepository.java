package com.spring_cloud.microservices.currency_exchange_service.repository;

import com.spring_cloud.microservices.currency_exchange_service.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}

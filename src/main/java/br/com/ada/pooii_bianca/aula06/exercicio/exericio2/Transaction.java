package br.com.ada.pooii_bianca.aula06.exercicio.exericio2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private BigDecimal amount;
    private String stock;
    private LocalDateTime created;

    public Transaction(BigDecimal amount, String stock) {
        this.amount = amount;
        this.stock = stock;
        this.created = LocalDateTime.now();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getStock() {
        return stock;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
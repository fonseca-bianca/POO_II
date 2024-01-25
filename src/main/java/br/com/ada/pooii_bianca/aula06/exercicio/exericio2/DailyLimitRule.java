package br.com.ada.pooii_bianca.aula06.exercicio.exericio2;

import java.math.BigDecimal;

public class DailyLimitRule implements RuleChecker{
    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");
    private static final BigDecimal MIN_DAILY_LIMIT = new BigDecimal("20");

    void executeTrade(Transaction transaction) {

        // executar transacao

        // add new rule to validate min value per transaction
        // verify if stock is available for trading

        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("invalid transaction: max limit");
        }

        if (isAfterWorkingHours(transaction)) {
            throw new RuntimeException("invalid transaction: after working hours");
        }


    }
}

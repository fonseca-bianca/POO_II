package br.com.ada.pooii_bianca.aula06.exercicio.exericio2;

import java.time.LocalDateTime;

public class AfterWorkinHoursRule implements RuleChecker{

    public void verifyAfterWorkingHours(Transaction transaction)
    private boolean isAfterWorkingHours(Transaction transaction) {
        // logica para verificar a hora
        LocalDateTime limit =
                LocalDateTime.of(2024,1,19,22,0,0);
        return transaction.getCreated().isAfter(limit);
    }
}

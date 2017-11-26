package net.eutkin.strategy.example;

import net.eutkin.strategy.example.tax.TaxContext;
import net.eutkin.strategy.example.tax.TaxType;
import net.eutkin.strategy.example.tax.calculator.TaxCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
@Component
public class UseCase implements ApplicationListener<ApplicationReadyEvent> {

    private final static Logger log = LoggerFactory.getLogger(UseCase.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        TaxCalculator taxCalculator = applicationReadyEvent.getApplicationContext().getBean(TaxCalculator.class);
        Double tax = taxCalculator.calculate(new TaxContext(TaxType.SIMPLE, 10020d));
        log.info("Calculated tax = " + tax);
    }
}

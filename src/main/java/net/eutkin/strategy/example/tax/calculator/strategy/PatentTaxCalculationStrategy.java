package net.eutkin.strategy.example.tax.calculator.strategy;

import net.eutkin.strategy.example.tax.TaxContext;
import net.eutkin.strategy.example.tax.TaxType;
import org.springframework.stereotype.Service;

import static net.eutkin.strategy.example.tax.TaxType.PATENT;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
@Service
public class PatentTaxCalculationStrategy implements TaxCalculationStrategy {

    @Override
    public boolean support(TaxType taxType) {
        return taxType == PATENT;
    }

    @Override
    public double calculate(TaxContext taxContext) {
        return 0;
    }
}

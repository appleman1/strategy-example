package net.eutkin.strategy.example.tax.calculator.strategy;

import net.eutkin.strategy.example.tax.TaxContext;
import net.eutkin.strategy.example.tax.TaxType;
import org.springframework.stereotype.Service;

import static net.eutkin.strategy.example.tax.TaxType.SIMPLE;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
@Service
public class SimpleTaxCalculationStrategy implements TaxCalculationStrategy {

    @Override
    public boolean support(TaxType taxType) {
        return taxType == SIMPLE;
    }

    @Override
    public double calculate(TaxContext taxContext) {
        //some calculation algorithm
        return 0;
    }
}

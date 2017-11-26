package net.eutkin.strategy.example.tax.calculator.strategy;

import net.eutkin.strategy.example.tax.TaxContext;
import net.eutkin.strategy.example.tax.TaxType;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
public interface TaxCalculationStrategy {

    boolean support(TaxType taxType);

    double calculate(TaxContext taxContext);
}

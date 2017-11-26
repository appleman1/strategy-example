package net.eutkin.strategy.example.tax.calculator;

import net.eutkin.strategy.example.Calculator;
import net.eutkin.strategy.example.tax.TaxContext;
import net.eutkin.strategy.example.tax.calculator.strategy.TaxCalculationStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.unmodifiableList;
import static org.springframework.util.Assert.notEmpty;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
@Service
public class TaxCalculator implements Calculator<TaxContext, Double> {

    private final List<TaxCalculationStrategy> calculationStrategies;

    public TaxCalculator(List<TaxCalculationStrategy> calculationStrategies) {
        notEmpty(calculationStrategies, "Calculation Strategies must be not empty");
        this.calculationStrategies = unmodifiableList(calculationStrategies);
    }

    @Override
    public Double calculate(TaxContext taxContext) {
        return calculationStrategies
                .stream()
                .filter(strategy -> strategy.support(taxContext.getTaxType()))
                .map(strategy -> strategy.calculate(taxContext))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}

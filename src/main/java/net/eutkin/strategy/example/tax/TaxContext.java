package net.eutkin.strategy.example.tax;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
public class TaxContext {

    private final TaxType taxType;

    private final Double profit;

    public TaxContext(TaxType taxType, Double profit) {
        this.taxType = taxType;
        this.profit = profit;
    }


    public TaxType getTaxType() {
        return taxType;
    }

    public Double getProfit() {
        return profit;
    }

}

package net.eutkin.strategy.example.tax;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
public enum TaxType {

    SIMPLE(1.0), PATENT(1.2);

    private final Double coeff;

    TaxType(Double coeff) {
        this.coeff = coeff;
    }

    public Double getCoeff() {
        return coeff;
    }
}

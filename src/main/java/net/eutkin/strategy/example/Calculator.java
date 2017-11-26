package net.eutkin.strategy.example;

/**
 * <p>
 * Создан 07.07.2016
 * <p>
 *
 * @author Евгений Уткин (evgeny.utkin@mediascope.net)
 */
public interface Calculator<T, R extends Number> {

    R calculate(T context);
}

package com.example.servlet;

import java.math.BigDecimal;

/**
 * @author v_lujichao
 */
public class CalculatorForPpi {

    private static BigDecimal divide;

    public static BigDecimal calculate(int width, int height, double size) {

        if (width > 0 && height > 0 && size > 0) {
            String addResult = new BigDecimal(width).pow(2).add(new BigDecimal(height).pow(2)).toString();

            // 开平方
            BigDecimal sqr = new BigDecimal(
                    Math.sqrt(Double.parseDouble(addResult)));

            // 最后的计算结果
            divide = sqr.divide(new BigDecimal(size), 2);
        } else {
            divide = new BigDecimal(-1);
        }

        return divide;
    }
}

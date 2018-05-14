package com.nestrik.app;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RtriangleTest {
    private Rtriangle triangle = RtriangleProvider.getRtriangle();

    /**
     * <p>Вспомогательный метод: вычисляет расстояние между точками в декартовой системе координат</p>
     * @param x1 координата x 1ой точки
     * @param y1 координата y 1ой точки
     * @param x2 координата x 2ой точки
     * @param y2 координата y 2ой точки
     * @return double расстояние между точками
     */
    private double getDistanceBetweenPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Test
    void testTriangleIsRight() {
        double AB = getDistanceBetweenPoints(triangle.getApexX1(),
                                             triangle.getApexY1(),
                                             triangle.getApexX2(),
                                             triangle.getApexY2());
        double BC = getDistanceBetweenPoints(triangle.getApexX2(),
                                             triangle.getApexY2(),
                                             triangle.getApexX3(),
                                             triangle.getApexY3());
        double CA = getDistanceBetweenPoints(triangle.getApexX3(),
                                             triangle.getApexY3(),
                                             triangle.getApexX1(),
                                             triangle.getApexY1());

        double[] sides = {AB, BC, CA};
        Arrays.sort(sides);
        assertEquals(Math.pow(sides[2], 2),
                     Math.pow(sides[0], 2) + Math.pow(sides[1], 2),
                     0.0001);
    }
}

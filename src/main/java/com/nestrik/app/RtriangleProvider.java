package com.nestrik.app;

public final class RtriangleProvider {
    public static Rtriangle getRtriangle() {
        return new Rtriangle() {
            public int getApexX1() {
                return 0;
            }

            public int getApexY1() {
                return 0;
            }

            public int getApexX2() {
                return 2;
            }

            public int getApexY2() {
                return 0;
            }

            public int getApexX3() {
                return 0;
            }

            public int getApexY3() {
                return 3;
            }
        };
    }
}
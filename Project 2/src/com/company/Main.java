package com.company;

public class Main {
    int g = 10;
    int minForce = -300;
    int maxForce = 300;
    double M1 = 10, M2 = 4, M3 = 7;
    double mu1 = 0.1, mu2 = 0.4, mu3 = 0.6;

    double M = M1 + M2 + M3;
    double[] F = {100, 200, 300};
    double[] T = {1, 2, 3};

    public static void main(String[] args) {
        // M*g + F1(friction) + F + N = M*a1
        // M2*g + F2(friction) + T2 + N2 = M2*a2
        // M3*g + F3(friction) + T3 = M3*a3
        // calculate positions
    }
}

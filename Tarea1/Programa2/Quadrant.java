package Tarea1.Programa2;

import java.util.Arrays;

public class Quadrant {
    private double[] point;

    public Quadrant(double[] point) {
        this.point = point;
    }

    public String getQuadrant() {
        if (Arrays.equals(this.point, new double[] { 0d, 0d })) {
            return "Origen";
        } else if (this.point[0] == 0d) {
            return "Eje Y";
        } else if (this.point[1] == 0d) {
            return "Eje X";
        } else if (this.point[0] > 0d && this.point[1] > 0d) {
            return "Cuadrante 1";
        } else if (this.point[0] < 0d && this.point[1] > 0d) {
            return "Cuadrante 2";
        } else if (this.point[0] < 0d && this.point[1] < 0d) {
            return "Cuadrante 3";
        } else if (this.point[0] > 0d && this.point[1] < 0d) {
            return "Cuadrante 4";
        }
        return "Invalid";
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

}

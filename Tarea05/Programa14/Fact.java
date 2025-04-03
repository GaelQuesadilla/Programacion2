/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea05.Programa14;

/**
 *
 * @author Hecto
 */
public class Fact {

    private int num;
    private int r;

    public Fact(int num) {
        this.num = num;
    }

    public int MFactorial(int n) {
        int rest;
        if (n <= 1) {
            rest = 1;
        } else {
            rest = n * MFactorial(n - 1);
        }
        return rest;
    }

    public int obtenerNum() {
        return num;
    }

    public int etablecerR() {
        return r;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

}

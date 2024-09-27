/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop6;

/**
 *
 * @author poo03alu23
 */
public class Coche {
     private String color;
    private String marca;
    private String placa;
   
    public Coche() {
    }

    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
    public void acelerar(){
        System.out.println("acelerar");
    }
    public void frenar(){
        System.out.println("frenar");
    }
    public void carga(String cosa){
        System.out.println("Estoy cargando "+cosa);
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
   
}   

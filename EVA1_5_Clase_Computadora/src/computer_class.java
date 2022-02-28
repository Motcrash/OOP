/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerac
 */
public class computer_class {

    public static void main(String[] args) {
        Computer compu1 = new Computer();
        compu1.setMarca("HP");
        compu1.setProcesador("Intel");
        compu1.setGrafica("NVIDIA");
        compu1.setRam(16);
        compu1.setRelojVel("4.0GHz");
        compu1.setPrecio(16000.00);
        compu1.setPrecioTotal(16000.00);
        compu1.imprimirDatos();
    }
}
 class Computer{
            String marca, procesador, grafica,relojVel;
            int ram;
            double precio, precioTotal;
            
            public void setMarca(String valor){
                marca = valor;
            }
            public void setProcesador(String valor){
                procesador = valor;
            }
            public void setGrafica(String valor){
                grafica = valor;
            }
            public void setRam(int valor){
                ram = valor;
            }
            public void setRelojVel(String valor){
                relojVel = valor;
            }
            public void setPrecio(double valor){
                precio = valor;
            }
            public void setPrecioTotal(double valor){
                precioTotal = valor+(valor*0.16);
            }
            
            
            public String getMarca(){
                return marca;
            }
            public String getProcesador(){
                return procesador;
            }
            public String getGrafica(){
                return grafica;
            }
            public int getRam(){
                return ram;
            }
            public String getRelojVel(){
                return relojVel;
            }
            public double getPrecio(){
                return precio;
            }
            public double getPrecioTotal(){
                return precioTotal;
            }
            
            public void imprimirDatos(){
                System.out.println("Especificaciones:");
                System.out.println("Marca: "+marca);
                System.out.println("Procesador: "+procesador);
                System.out.println("Gráfica: "+grafica);
                System.out.println("Ram: "+ram);
                System.out.println("Velocidad del reloj: "+relojVel);
                System.out.println("precio: $"+ precio);
                System.out.println("Precio total: $"+precioTotal);
            }
}



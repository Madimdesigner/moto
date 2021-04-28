package UD4;

/**
 * Moto.java*
 */
public class Moto {    
    
    private String modelo;
    private int numeroRuedas;
    private int cilindrada;
    private int velocidadMaxima;
    private int peso;
    private String color;
    private int precio;
    private int stock;//Cantidad de motos de las que se disponen

    //Método vacío
    public Moto() {
    }

    //Método que indica el modelo, color y stock de motos
    public Moto(String modelo, String color, int stock) {
        this.modelo = modelo;
        this.color = color;
        this.stock = stock;
    }    

    //Método que indica la cantidad a comprar
    public void comprar(int cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de motos");
        setStock(getStock() + cantidad);
    }

    //Método que indica otras características de la moto
    public Moto(String modelo, int numeroRuedas, int cilindrada, int velocidadMaxima, int peso, String color, int precio, int stock) {
        this.modelo = modelo;
        this.numeroRuedas = numeroRuedas;
        this.cilindrada = cilindrada;
        this.velocidadMaxima = velocidadMaxima;
        this.peso = peso;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the numeroRuedas
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @param numeroRuedas the numeroRuedas to set
     */
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}

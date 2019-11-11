package ejercicio_4;

public class Videojuego implements Entregable {
    private String titulo;
    private int horas_est;
    private boolean entregado;
    private String genero;
    private String company;
    
    Videojuego(){
        this.titulo = "";
        this.horas_est = 100;
        this.entregado = false;
        this.genero = "";
        this.company = "";
    }
    
    Videojuego(String titulo, int horas_est){
        this.titulo = titulo;
        this.horas_est = horas_est;
        this.entregado = false;
        this.genero = "";
        this.company = "";
    }
    
    Videojuego(String titulo, int horas_est, String genero, String company){
        this.titulo = titulo;
        this.horas_est = horas_est;
        this.entregado = false;
        this.genero = genero;
        this.company = company;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_est() {
        return horas_est;
    }

    public void setHoras_est(int horas_est) {
        this.horas_est = horas_est;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego b = (Videojuego)a;
        if(this.horas_est < b.getHoras_est()){
            return 1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "\nHoras estimadas: " + this.horas_est +
            "\nEntregado: " + this.entregado + "\nGenero: " + this.genero +
            "\nCompañia: " + this.company;
    }
}

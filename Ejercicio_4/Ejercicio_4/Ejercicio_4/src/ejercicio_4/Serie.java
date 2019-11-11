package ejercicio_4;

public class Serie implements Entregable {
    private String titulo;
    private int num_temp;
    private boolean entregado;
    private String genero;
    private String creador;
    
    Serie(){
        this.titulo = "";
        this.num_temp = 3;
        this.entregado = false; 
        this.genero = "";
        this.creador = "";
    }
    
    Serie(String titulo, String creador){
         this.titulo = titulo;
        this.num_temp = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }
    
    Serie(String titulo, int num_temp, String genero, String creador){
        this.titulo = titulo;
        this.num_temp = num_temp;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;        
    }
    
  public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_temp() {
        return num_temp;
    }

    public void setNum_temp(int num_temp) {
        this.num_temp = num_temp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        Serie b = (Serie)a;
        if(this.num_temp < b.getNum_temp()){
            return 1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "\nTemporadas: " + this.num_temp +
            "\nEntregado: " + this.entregado + "\nGenero: " + this.genero +
            "\nCreador: " + this.creador;
    }
}

package ejercicio_4;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Serie s5[] = new Serie[5];
        Videojuego v5[] = new Videojuego[5];
        int acum1 = 0, acum2 = 0, x, y = 0, w = 0;
        s5[0] = new Serie("Two and a half men", 12, "comedia", "Chuck Lorre");
        s5[1] = new Serie("Dr House", 8, "drama", "David Shore");
        s5[2] = new Serie("Friends", 10, "comedia", "David Crane");
        s5[3] = new Serie("The Big Bang Theory", 11, "comedia", "Chuck Lorre");
        s5[4] = new Serie("Game of Thrones", 8, "Fantasia", "David Benioff");
        v5[0] = new Videojuego("Dark Souls III", 100, "Accion", "FromSoftware");
        v5[1] = new Videojuego("Super Smash Bros. Ultimate", 50, "Peleas", "Nintendo");
        v5[2] = new Videojuego("The Witcher 3: Wild Hunt", 150, "Accion", "CD Projekt RED");
        v5[3] = new Videojuego("Grand Theft Auto V", 70, "Aventura", "Rockstar Games");
        v5[4] = new Videojuego("Minecraft", 100, "Aventura", "Mojang");

        v5[3].entregar();
        s5[0].entregar();
        v5[4].entregar();
        s5[4].entregar();
        s5[2].entregar();

        for (int i = 0; i < 5; i++) {

            if (s5[i].isEntregado() == true) {
                acum1++;
                s5[i].devolver();
            }
            if(v5[i].isEntregado() == true){
                acum2++;
                v5[i].devolver();
            }
        }
        System.out.println("Las series entregadas fueron " + acum1 + " y los videojuegos entregados fueron " + acum2);
        
        
        acum1 = 0;
        acum2 = 0;
        for(int i = 0; i < 5; i++){
            x = s5[i].getNum_temp();
            if(x > acum1){
                acum1 = x;
                y = i;
            }
            x = v5[i].getHoras_est();
            if(x > acum2){
                acum2 = x;
                w = i;
            }
            
        }
        System.out.println("El videojuego con mas horas estimadas es:\n " + v5[w].toString());
        
        System.out.println("La serie con mas temporadas es:\n " + s5[y].toString());
        
    }

}

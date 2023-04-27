package reloj;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tiempo(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora inválida. Se establecerá la hora en 00:00:00.");
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. No se realizó ningún cambio.");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos. No se realizó ningún cambio.");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos. No se realizó ningún cambio.");
        }
    }

    public void imprimirHoraCompleta() {
        String horaCompleta = String.format("%02d:%02d:%02d", hora, minutos, segundos);
        System.out.println(horaCompleta);
    }

    public void avanzarUnSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }
}


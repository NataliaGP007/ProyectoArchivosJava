package Archivos;

public class Numerologia {
    private String nombre;
    private int anioNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioActual;
    private int mesActual;
    private int diaActual;
    private int edad;
    private String signoZodiacal;
    private int numeroSuerte;

    public Numerologia(String nombre,  int anioNacimiento, int mesNacimiento, int diaNacimiento, int anioActual, int mesActual, int diaActual) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioActual = anioActual;
        this.mesActual = mesActual;
        this.diaActual = diaActual;
        this.calcularEdad();
        this.identificarSignoZodiacal();
        this.calcularNumeroSuerte();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public void setAnioActual(int anioActual) {
        this.anioActual = anioActual;
    }

    public int getMesActual() {
        return mesActual;
    }

    public void setMesActual(int mesActual) {
        this.mesActual = mesActual;
    }

    public int getDiaActual() {
        return diaActual;
    }

    public void setDiaActual(int diaActual) {
        this.diaActual = diaActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSignoZodiacal() {
        return signoZodiacal;
    }

    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }

    public int getNumeroSuerte() {
        return numeroSuerte;
    }

    public void setNumeroSuerte(int numeroSuerte) {
        this.numeroSuerte = numeroSuerte;
    }

    public void calcularEdad() {
        this.edad = this.anioActual - this.anioNacimiento;
        if ((this.mesActual < this.mesNacimiento) || (this.mesActual == this.mesNacimiento && this.diaActual < this.diaNacimiento)) {
            this.edad = this.edad - 1;
        }
        this.edad = this.edad * 8760;
    }

    public void identificarSignoZodiacal() {
        //Este metodo identificará el signo zodiacal del usuario.
        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 22) || (this.mesNacimiento == 1 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Capricornio";}
        else if ((this.mesNacimiento == 1 && this.diaNacimiento >= 22) || (this.mesNacimiento == 2 && this.diaNacimiento <= 19)){
            this.signoZodiacal = "Acuario";}
        else if ((this.mesNacimiento == 2) || (this.mesNacimiento == 3 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Piscis";}
        else if ((this.mesNacimiento == 3) || (this.mesNacimiento == 4 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Aries";}
        else if ((this.mesNacimiento == 4) || (this.mesNacimiento == 5 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Tauro";}
        else if ((this.mesNacimiento == 5) || (this.mesNacimiento == 6 && this.diaNacimiento <= 21)){
            this.signoZodiacal = "Géminis";}
        else if ((this.mesNacimiento == 6) || (this.mesNacimiento == 7 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Cáncer";}
        else if ((this.mesNacimiento == 7) || (this.mesNacimiento == 8 && this.diaNacimiento <= 23)){
            this.signoZodiacal = "Leo";}
        else if ((this.mesNacimiento == 8) || (this.mesNacimiento == 9 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Virgo";}
        else if ((this.mesNacimiento == 9) || (this.mesNacimiento == 10 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Libra";}
        else if ((this.mesNacimiento == 10) || (this.mesNacimiento == 11 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Escorpio";}
        else {this.signoZodiacal = "Sagitario";}
        }

    public void calcularNumeroSuerte() {
        int anio = this.anioNacimiento;
        while (anio > 0) {
            this.numeroSuerte = this.numeroSuerte + anio % 10;
            anio = anio / 10;
        }
        while (this.numeroSuerte > 9) {
            this.numeroSuerte = this.numeroSuerte - 9;
        }
    }
}

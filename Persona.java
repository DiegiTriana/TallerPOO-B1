public class Persona{
    private String nombre;
    private int edad;
    private int cedula;
    private char sexo;
    private double peso;
    private double altura;
    

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = 0;
        this.peso = 0.0;
        this.altura= 0.0;
    }

    
    public double calcularIMC(){
        double imc = peso / (altura * altura);
        double sobrePeso = -1;
        double pesoIdeal = 1;
        double pesoNoideal = 0;
        if (imc < 20) {
            return pesoNoideal;
        } else if (imc >= 20 && imc <= 25) {
            return pesoIdeal;
        } else {
            return sobrePeso;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >=18;
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    public int generaCedula(){
       
        cedula = (int) (Math.random() * 10) + 1;
        return cedula;

    }

    public String toString()
    {return "Nombre: " + nombre +
    "\nEdad: " + edad +
    "\nCédula: " + cedula +
    "\nSexo: " + sexo +
    "\nPeso: " + peso +
    "\nAltura: " + altura;
}


    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad) {
        this.edad = edad;
    }
    public int getcedula(){
        return cedula;
    }
    public void setcedula(int cedula) {
        this.cedula = cedula;
    }
    public char getsexo(){
        return sexo;
    }
    public void setsexo(char sexo) {
        this.sexo = sexo;
    }
    public double getpeso(){
        return peso;
    }
    public void setpeso(double peso) {
        this.peso = peso;
    }
    public double getaltura(){
        return altura;
    }
    public void setaltura(double altura) {
        this.altura = altura;
    }


}









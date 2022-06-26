package miClase;

public class Coche
{


    private String nombre;
    private int puertas;

    public Coche(String nuevoNombre)
    {
        nombre = nuevoNombre;
    }


    public int getPuertas()
    {
        return puertas;
    }


    public void setPuertas(int nuevasPuertas)
    {
        puertas = nuevasPuertas;
    }


    public String getNombre()
    {
        return nombre;
    }





    public static void main(String[] args)
    {
        Coche miCoche = new Coche("nissan");
        miCoche.setPuertas(2);
        System.out.println("este coche es un: " + miCoche.getNombre());
        System.out.println(" y tiene " + miCoche.getPuertas() + " puertas");
    }
}
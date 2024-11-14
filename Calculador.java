public class Calculador implements ICalcularArea{

    @Override
    public double calcular_triangulo( double base1, double altura1){
        return (base1 * altura1)/2;
    }
    public double calcular_retangulo( double base2, double altura2){
        return base2 * altura2;
    }
   
}
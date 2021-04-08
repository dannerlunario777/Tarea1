
public class Calculadora
{
    int num1;
    int num2;
    int num3;
    int num4;

    Calculadora(int num1, int num2, int num3, int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int suma(){
        int suma = num1 + num2 + num3 + num4;
        return suma;
    }

    public int producto(){
        int producto = num1 * num2 * num3 * num4;
        return producto;
    }

    private int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    private int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int sum(){
        int suma = num1 + num2;
        return suma;
    }
    public int res(){
        int resta = num1 - num2;
        return resta;
}
}


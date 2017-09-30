public class Form {

    public static void main(String[] args){

        int a = 0, b = 100, x = 0;

        for(; x < b; x++){
            a = calcular(a, x);
        }
    }

    public static int calcular(int a, int x){
        return a + x;
    }

}

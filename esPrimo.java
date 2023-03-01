public class esPrimo{
    public static boolean esPrio(int n){
        int i= 2;
        if(n<1){
            return false;
        }
        while(i<n){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
}
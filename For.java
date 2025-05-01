public class For {
    public static void main(String[] args) {
        //int n = 10;
        int[] array = {1,2,3,2,5,6,7,8,9,5};
        funcaoD(array,array.length-1);
    }

    public static void funcaoA(int n){
        for(int i=0; i<n;i++)
            System.out.println(i);
    }
    public static void funcaoB(int n){
        if(n>=0){
            System.out.println(n);
            funcaoB(n - 1);
        }
    }

    public static void funcaoC(int n){
        if(n>=0){
            funcaoC(n-1);
            System.out.println(n);
        }
    }

    public static void funcaoD(int[] array, int n){
        if(n>=0){
            funcaoD(array, n - 1);
            System.out.println(array[n]);
        }
    }

}

public class Main {
    public static void main(String[] args) {
//        int n = 10;
//
//        for (int i = 0; i < n; i++){
//            System.out.print(fibo(i) + " - ");
//        }
//    }
//        public static int fibo(int n){
//            if (n <= 1) {
//                return n;
//            } else {
//                return fibo(n - 1) + fibo(n - 2);
//            }
//        }


        String pa = "palabra";
        char letra= 'a';
        int cont = 0;
        for (int i = 0; i < pa.length(); i++){
            if(pa.charAt(i) == letra){
                cont++;
            }
        }
        System.out.println("la letra : " + letra + " aparece " + cont);
    }
}


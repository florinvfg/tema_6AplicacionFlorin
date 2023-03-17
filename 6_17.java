6.17 Florin

 public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca una palabra: ");
        String palabra = sc.nextLine();
        
        System.out.print("Introduzca la longitud de las secuencias: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < palabra.length(); i += n) {
            int fin = Math.min(i + n, palabra.length());
            System.out.print(palabra.substring(i, fin) + ",");
        }
        
        sc.close();
    }

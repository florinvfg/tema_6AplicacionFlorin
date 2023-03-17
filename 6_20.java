6.20 Florin

public static void main(String[] args) {

        // Leer la frase del usuario
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase:");
        String frase = scanner.nextLine();

        // Separar las palabras y ordenarlas
       
         String[] palabras = frase.split(" "); //El método split() divide (fragmenta) un string en dos o más sub cadenas 
        Arrays.sort(palabras); //ordenar alfabetico

        // Mostrar las palabras ordenadas
        
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

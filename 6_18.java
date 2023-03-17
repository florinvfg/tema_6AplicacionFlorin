6.18 Florin
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.split("\\s+");//es un método en Java que se utiliza para dividir una cadena de texto 

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i].toLowerCase();
            if (i == 0) {
                sb.append(palabra);
            } else {
               
 sb.append(palabra.substring(0, 1).toUpperCase()); 

//agregar un valor a una instancia de la clase,substring(0, 1)extrae la primera letra de la cadena de texto palabra,toUpperCase()la convierte a mayúscula
                
sb.append(palabra.substring(1));

//el método "append" de la clase "StringBuilder" para concatenar una cadena de caracteres,primera letra de la cadena "palabra" se excluye y se agregan todas las letras restantes al StringBuilder.
            }
        }

        String variable = sb.toString();
        System.out.println("Nombre de variable en formato camel: " + variable);
    }

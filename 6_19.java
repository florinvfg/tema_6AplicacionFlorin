6.19 Florin
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el texto: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce la palabra que deseas reemplazar: ");
        String palabraOriginal = scanner.nextLine();
        System.out.print("Introduce la palabra por la que deseas reemplazarla: ");
        String palabraNueva = scanner.nextLine();

        String nuevoTexto = texto.replaceAll(palabraOriginal, palabraNueva); //replaceAll de la clase String para reemplazar todas las ocurrencias de la palabra original por la nueva palabra.

        System.out.println("El texto original era: " + texto);
        System.out.println("El texto modificado es: " + nuevoTexto);
    }

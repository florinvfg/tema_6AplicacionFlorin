6.13 Florin

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una sentencia en lenguaje C: ");
        String sentencia = scanner.nextLine();

        // Eliminar comentarios
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < sentencia.length()) {
            char c = sentencia.charAt(i);
            if (c == '/') {
                if (i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '*') {
                    i += 2;
                    while (i < sentencia.length() - 1 && (sentencia.charAt(i) != '*' || sentencia.charAt(i + 1) != '/')) {
                        i++;
                    }
                    i += 2;
                } else {
                    sb.append(c);
                    i++;
                }
            } else {
                sb.append(c);
                i++;
            }
        }

        // Imprimir sentencia sin comentarios
        System.out.println("Sentencia sin comentarios: " + sb.toString());
    }

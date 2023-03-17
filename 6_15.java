6.15 Florin

 public static void main(String[] args) {
        String url = "https://www.example.com";
        String title = "";
        String content = "";

        // Obtener el documento HTML de la página web
        Document doc = Jsoup.connect(url).get();
        // Obtener el título de la página
        title = doc.title();
        // Obtener el contenido de la página
        content = doc.body().text();

        // Generar el documento HTML
        String html = "<html><head><title>" + title + "</title></head><body><h1>" + title + "</h1><p>" + content + "</p></body></html>";

        // Guardar el documento HTML en un archivo
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.html"));
            writer.write(html);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Documento HTML generado correctamente.");
    }

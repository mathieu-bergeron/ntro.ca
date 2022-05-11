public class Exemple {


    private InputStream lireCss(){

                             // src/main/resources/css/test.css
        return Exemple.class.getResourceAsStream("/css/test.css");
    }
}

package cubomagico;

public class ValidarCeldas {

    

    public boolean sumaMagica(String digito1, String digito2, String digito3) {

        if (Integer.parseInt(digito1) + Integer.parseInt(digito2) + Integer.parseInt(digito3) == 15) {
            return true;
        } else {
            return false;
        }
    }

//
}

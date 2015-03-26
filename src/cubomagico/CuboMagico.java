package cubomagico;
public class CuboMagico {

    MiCubo mc;
    ValidarCeldas vc;
    public CuboMagico() {
        mc = new MiCubo(this);
        vc= new ValidarCeldas();
        mc.setVisible(true);
    }

    public static void main(String[] args) {
        new CuboMagico();
    }

}

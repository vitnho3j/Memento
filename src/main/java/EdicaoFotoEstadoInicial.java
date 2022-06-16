public class EdicaoFotoEstadoInicial implements EdicaoFoto{

    private EdicaoFotoEstadoInicial(){};

    private static EdicaoFotoEstadoInicial instance = new EdicaoFotoEstadoInicial();

    public static EdicaoFotoEstadoInicial getInstance(){
        return instance;
    }

    public String getNomeEdicao(){
        return "Estado Inicial";
    }

}

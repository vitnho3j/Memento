public class EdicaoFotoContraste implements EdicaoFoto{

    private EdicaoFotoContraste(){}

    private static EdicaoFotoContraste instance = new EdicaoFotoContraste();
    public static EdicaoFotoContraste getInstance(){
        return instance;
    }

    public String getNomeEdicao(){
        return "Contraste Adicionado";
    }

}

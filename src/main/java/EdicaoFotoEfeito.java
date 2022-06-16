public class EdicaoFotoEfeito implements EdicaoFoto{

    private EdicaoFotoEfeito () {};

    private static  EdicaoFotoEfeito instance = new EdicaoFotoEfeito();

    public static EdicaoFotoEfeito getInstance() {
        return instance;
    }

    public String getNomeEdicao(){
        return "Efeito adicionado";
    }
}

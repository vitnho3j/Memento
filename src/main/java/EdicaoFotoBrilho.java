public class EdicaoFotoBrilho implements EdicaoFoto{

    private EdicaoFotoBrilho(){}

    private static EdicaoFotoBrilho instance = new EdicaoFotoBrilho();
    public static EdicaoFotoBrilho getInstance(){
        return instance;
    }

    public String getNomeEdicao(){
        return "Brilho adicionado";
    }

}

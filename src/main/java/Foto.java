import java.util.ArrayList;
import java.util.List;

public class Foto {

    private EdicaoFoto estado;

    private List<EdicaoFoto> memento = new ArrayList<EdicaoFoto>();

    public EdicaoFoto getEstado(){
        return this.estado;
    }

    public void setEstado(EdicaoFoto estado){
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice){
        if (indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice Inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EdicaoFoto> getEstados(){
        return this.memento;
    }


}

public class No<T> {

    private T tarefas;
    private No<T> noProx;
    private No<T> noAnt;

    public T getTarefas() {
        return tarefas;
    }

    public void setTarefas(T tarefas) {
        this.tarefas = tarefas;
    }

    public No<T> getNoProx() {
        return noProx;
    }

    public void setNoProx(No<T> noProx) {
        this.noProx = noProx;
    }

    public No<T> getNoAnt() {
        return noAnt;
    }

    public void setNoAnt(No<T> noAnt) {
        this.noAnt = noAnt;
    }

    public No(T tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "No{" +
                "tarefas=" + tarefas +
                '}';
    
}
  } 
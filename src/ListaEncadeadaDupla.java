public class ListaEncadeadaDupla<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;

    private int tamanhoLista = 0;

    //metodo para adicionar elemento a lista
    public void add(T elemento) {
        No<T> novoNo = new No<T>(elemento); //inicializa o no do novo elemento
        novoNo.setNoProx(null); //conecta o novo no ao proximo 
        novoNo.setNoAnt(ultimoNo); //conecta o novo no ao elemento anterior 
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        //se o primeiro no estiver vazio, o novo no se torna o cabeça
        if(ultimoNo != null){
            ultimoNo.setNoProx(novoNo);
        }
        //se o ultimo estiver ocupado, o novo no é adiconado depois dele
        ultimoNo = novoNo; //o novo no se torna o ultimo
        tamanhoLista++; // e o tamanho da lista é incrementado
    }

    //metodo para adicionar elemento em uma posição especifica do index
    public void add(int index, T elemento){
        No<T> noAuxiliar = getNo(index); //incializa o no auxiliar(anterior)
        No<T> novoNo = new No<>(elemento); //inicializa no do novo elemento
        novoNo.setNoProx(noAuxiliar); 

        if(novoNo.getNoProx() != null){
            novoNo.setNoAnt(noAuxiliar.getNoAnt());
            novoNo.getNoProx().setNoAnt(novoNo);
            //se o prox no estiver ocupado ele
        //seta o novo no entre o elemento anterior e o prox da posição escolhida
        }else {
            novoNo.setNoAnt(ultimoNo);
            ultimoNo = novoNo;
        //caso contrario, ele define o novo no como ultimo 
        }
        if(index == 0){
            primeiroNo = novoNo;
        //se o index estiver vazio,o novo no se torna a cabeça
        }else {
            novoNo.getNoAnt().setNoProx(novoNo);
        //se não,o novo no é adicionado no meio 
        }
        tamanhoLista++; //o tamanho da lista é incrementado
    } 

    //metodo para remover elementos da lista
    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProx();
        //se a cabeça estiver vazia,o primeiro no aponta para o prox dando inicio a lista
            if(primeiroNo != null){
                primeiroNo.setNoAnt(null);
            }
        //inicializa o primeiro no como null 
        }else{
            No<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnt().setNoProx(noAuxiliar.getNoProx());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProx().setNoAnt(noAuxiliar.getNoAnt());
            //se o no aux não for o ultimo elemento da lista
            //percorre a lista a procura do no    
            }else{
                ultimoNo = noAuxiliar;
            //até o seu fim
            }
        }
        tamanhoLista--;
        //o tamanho da lista diminui
        }
    

    //metodo que retorna o valor armazenado em uma posição especifica da lista
    public T get(int index){
        return getNo(index).getTarefas();
    }

    //metodo para procurar um elemento na lista
    private No<T> getNo(int index) {
        No<T> noAuxiliar = primeiroNo; //inicializa no pelo inicio 
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProx();
        //procura o elemento de no em no 
        }
         return noAuxiliar; //retorna o no anterior que aponta para o elemento sendo procurado
    }

    //metodo que retorna a quantidade de todos os elementos da lista
    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getTarefas() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProx();
        }
        strRetorno += "null";
        return strRetorno;
    }
}



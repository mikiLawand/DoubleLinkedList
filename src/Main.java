public class Main {
    public static void main(String[] args) {
        ListaEncadeadaDupla<String> minhListaEncadeadaDupla = new ListaEncadeadaDupla<>();

        minhListaEncadeadaDupla.add("assistir aulas");
        minhListaEncadeadaDupla.add("ir ao supermercado");
        minhListaEncadeadaDupla.add("lavar a louça");
        minhListaEncadeadaDupla.add("passear com o cachorro");

        System.out.println(minhListaEncadeadaDupla);

        minhListaEncadeadaDupla.remove(2);
        minhListaEncadeadaDupla.add(1, "pegar encomenda");
        System.out.println(minhListaEncadeadaDupla);
        System.out.println(minhListaEncadeadaDupla.get(3));
    }
}
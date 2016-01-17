package br.com.fences.fencesfiltrocustom.simples;

public class ChaveValor<C, V> {

	private final C chave;
    private V valor;

    public ChaveValor(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public V setValor(V valor) {
        V old = this.valor;
        this.valor = valor;
        return old;
    }

	@Override
	public String toString() {
		return "ChaveValor [chave=" + chave + ", valor=" + valor + "]";
	}
    
    
    
	
}

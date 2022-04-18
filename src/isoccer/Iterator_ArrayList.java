package isoccer;

public class Iterator_ArrayList implements Iterator{
    java.util.ArrayList<Funcionario> funcionarios;
    int posicao = 0;
    
    //construtor
    public Iterator_ArrayList(java.util.ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    @Override
    public Object first() {
        posicao = 0;
        Funcionario func = funcionarios.get(posicao);
        return func;
    }
    
    @Override
    public boolean isDone() {
        return posicao == funcionarios.size();
    }
     
    @Override
    public Object next() {
        Funcionario func = funcionarios.get(posicao);
        posicao++;
        return func;
    }
     
    @Override
    public boolean hasNext() {
        if (posicao >= funcionarios.size() || funcionarios.get(posicao) == null) {
            return false;
        } else {
            return true;
        }
    }
}

package isoccer;

public abstract class Funcionario {

    private String nome;
    private String email;
    private String cpf;
    private int salario;
    private String telefone;
    private String tipo;

    public void relat_func_gerais(java.util.ArrayList<Funcionario> Funcionarios) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList(Funcionarios); //construtor list
        
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (!(func.getTipo().equals("tecnico")) && !(func.getTipo().equals("jogador"))) {
                System.out.println("CARGO: " + func.getTipo());
                System.out.println("NOME: " + func.getNome());
                System.out.println("EMAIL: " + func.getEmail());
                System.out.println("CPF: " + func.getCpf());
                System.out.println("SALÁRIO: " + func.getSalario());
                System.out.println("TELEFONE: " + func.getTelefone());
                if (func.getTipo().equals("medico")) {
                    System.out.println("CRM: " + ((Medico)func).getCrm());
                }
                if (func.getTipo().equals("motorista")) {
                    System.out.println("NÚMERO DA HABILITAÇÃO: " + ((Motorista)func).getNum_hab());
                }
                System.out.println("---------------------------");
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

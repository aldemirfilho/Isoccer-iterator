package isoccer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tecnico extends Funcionario implements Interface_func{

    Scanner input = new Scanner(System.in);

    public void relat_tecnico(java.util.ArrayList<Funcionario> Funcionarios) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList(Funcionarios); //construtor list
        
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (func.getTipo().equals("tecnico")) {
                System.out.println("CARGO: Técnico");
                System.out.println("NOME: " + func.getNome());
                System.out.println("EMAIL: " + func.getEmail());
                System.out.println("CPF: " + func.getCpf());
                System.out.println("SALÁRIO: " + func.getSalario());
                System.out.println("TELEFONE: " + func.getTelefone());
            }
        }
    }

    @Override
    public void creat_funcionario(String tipo, java.util.ArrayList<Funcionario> Funcionarios) {
        int cont_aux = 0;
        String lixo;
        Tecnico tecnico = new Tecnico();
        tecnico.setTipo(tipo);
        System.out.println("Digite o nome do tecnico");
        tecnico.setNome(input.nextLine());
        System.out.println("Digite o email do tecnico");
        tecnico.setEmail(input.nextLine());
        System.out.println("Digite o cpf do tecnico");
        tecnico.setCpf(input.nextLine());
        System.out.println("Digite o salario do tecnico");
        while (cont_aux == 0) {
            try {
                tecnico.setSalario(input.nextInt());
                cont_aux++;
            } catch (InputMismatchException Exception) {
                lixo = input.nextLine();
                System.out.println();
                System.out.println("Foi digitado um elemento diferente de um numero! Tente novamente...\nDigite o salario do tecnico");
            }
        }
        cont_aux = 0;
        lixo = input.nextLine();
        System.out.println("Digite o telefone do tecnico");
        tecnico.setTelefone(input.nextLine());

        Funcionarios.add(tecnico);
    }
}

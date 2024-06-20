import OperacoesBasicas.ListaTarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ListaTarefa list = new ListaTarefa();

        System.out.println("O número total da lista é: " + list.obterNumeroTotalTarefas());
        list.adicionarTarefa("Comprar pão");
        list.adicionarTarefa("Comprar pão");

        System.out.println("O número total da lista é: " + list.obterNumeroTotalTarefas());
        
        list.obterDescricaoTarefas();


    }
}
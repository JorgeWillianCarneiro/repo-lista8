import javax.swing.JOptionPane;

public class main  {

    public static void main(String[] args) {
       
        String inputSalario = JOptionPane.showInputDialog(null, "Digite o salário atual do funcionário:");
        if (inputSalario == null) return; 

        String inputCodigo = JOptionPane.showInputDialog(null, "Digite o código do cargo (101, 102, 103 ou outro):");
        if (inputCodigo == null) return;

        double salarioAntigo = Double.parseDouble(inputSalario.replace(",", "."));
        int codigoCargo = Integer.parseInt(inputCodigo);

        String cargo;
        double percentualReajuste;

        switch (codigoCargo) {
            case 101:
                cargo = "Administrador";
                percentualReajuste = 0.80 / 100; 
                break;
            case 102:
                cargo = "Engenheiro";
                percentualReajuste = 0.65 / 100; 
                break;
            case 103:
                cargo = "Médico";
                percentualReajuste = 0.60 / 100; 
                break;
            default:
                cargo = "Outro cargo";
                percentualReajuste = 0.55 / 100; 
                break;
        }

        double diferenca = salarioAntigo * percentualReajuste;
        double novoSalario = salarioAntigo + diferenca;

        String mensagem = String.format(
            "Cargo: %s\n" +
            "Salário Antigo: R$ %.2f\n" +
            "Diferença do Aumento: R$ %.2f\n" +
            "Novo Salário: R$ %.2f",
            cargo, salarioAntigo, diferenca, novoSalario
        );

        JOptionPane.showMessageDialog(null, mensagem, "Reajuste Salarial", JOptionPane.INFORMATION_MESSAGE);
    }

}
package metodo_de_pesquisa;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Metodo_de_Pesquisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, flag;
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado"));
        String vetorPesquisado[] = new String[numElementos];
        for (i = 0; i < numElementos; i++) {
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome a ser cadastrado:");
        }
        String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
        flag = 0;
        for (i = 0; i < numElementos; i++) {
            if (vetorPesquisado[i].equals(elementoProcurado)) {
                JOptionPane.showMessageDialog(null, "o valor procurado foi encontrado na posição " + i);
                flag = 1;
            }
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "o nome não foi encontrado.");
        }
    }
}

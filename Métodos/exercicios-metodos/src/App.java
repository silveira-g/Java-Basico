import edu.dio.metodos.Calculadora;
import edu.dio.metodos.Mensagem;
import edu.dio.metodos.Emprestimo;
import edu.dio.metodos.Quadrilatero;
public class App {
    public static void main(String[] args) {
        Calculadora.soma(20, 10);
        Calculadora.subtracao(51, 23);
        Calculadora.divisao(10, 5);
        Calculadora.multiplicacao(56, 98);
        Mensagem.obterMensagem(8);
        Emprestimo.calcularEmprestimo(200, 2);
        Quadrilatero.calcularQuadrilatero(5);
        Quadrilatero.calcularQuadrilatero(5, 2);
        Quadrilatero.calcularQuadrilatero(5,2,3);
    }
}

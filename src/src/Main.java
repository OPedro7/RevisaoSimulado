//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 8;
        int resultado = Funcoes.soma(a,b);
        if(resultado != 8){
            System.out.println("Error!");
            System.exit(-1);
        } else {
            System.out.println("Acertou");
        }

    }
}
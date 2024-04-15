public class CondicionalSwitchCaseResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;
        
        switch (nota) {
            case 10:
            case 9:
                System.out.println("Aprovado com louvor");
                break;
            case 8:
            case 7:
                System.out.println("Aprovado");
                break;
            case 6:
            case 5:
                System.out.println("Recuperação");
                break;
            default:
                System.out.println("Reprovado");
        }
    }
}

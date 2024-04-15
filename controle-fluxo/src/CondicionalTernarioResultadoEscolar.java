public class CondicionalTernarioResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        
        String resultado = nota >= 7.0 ? "Aprovado" : nota >=5 && nota <7? "Recuperação": "Reprovado";
        System.out.println(resultado);
    }
}

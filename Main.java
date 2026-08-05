import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Usuario usuario1;

        usuario1 = new Usuario(1,
            "Jonathan",
            LocalDate.of(2007, 3, 06),
            "1234-5678", 
            "10 calle zona 1"
        );
        
        System.out.println(usuario1);
    }

}
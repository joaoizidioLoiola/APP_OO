
import java.sql.SQLException;
import java.util.ArrayList;


public class APP_OO {

    /*
        Criar variavel de qual login esta logado ------ OK
        Criar classe carro
    */
    
    public static void main(String[] args) throws SQLException {
        ArrayList<Usuario> Banco_Dados_Usuario = new ArrayList<Usuario>();
        
        Tela_Login t_l = new Tela_Login(Banco_Dados_Usuario);
        t_l.setVisible(true);

    }

}

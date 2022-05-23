package classes;

import enumeradores.tiposTelefone;
import javax.swing.JFormattedTextField;

public class telefone {

    JFormattedTextField telefone;
    private tiposTelefone tipotelefone;

    public telefone() {
    }

    public telefone(JFormattedTextField telefone, tiposTelefone tipotelefone) {
        this.telefone = telefone;
        this.tipotelefone = tipotelefone;
    }

    public JFormattedTextField getTelefone() {
        return telefone;
    }

    public void setTelefone(JFormattedTextField telefone) throws Exception {

        this.telefone = telefone;
    }

    public tiposTelefone getTipo() {
        return tipotelefone;
    }

    public void setTipo(tiposTelefone tipotelefone) {

        this.tipotelefone = tipotelefone;
    }

    @Override
    public String toString() {
        return tipotelefone + "," + new JFormattedTextField(telefone);
    }

   

}


package persistencia;

import classes.*;
import enumeradores.tipoCliente;
import enumeradores.tipoLogradouro;
import enumeradores.tiposTelefone;
import persistencia.iClienteDao;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import javax.swing.text.html.parser.AttributeList;

public class clientemetodos implements iClienteDao {

    private String nomeDoArquivoNoDisco = "Cliente.txt";

    @Override
    public void incluir(cliente objeto) throws Exception {

        try {
            int id = GeradorIdentificador.getID();
            objeto.setID(id);
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public void alterar(cliente objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public cliente consultar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<cliente> obterClientes() throws Exception {
        try {
            ArrayList<cliente> listaCliente = new ArrayList<cliente>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                cliente objetoCliente = new cliente();
                String vetorString[] = linha.split(";");
                telefone objetoTelefone = new telefone();
                endereco objetoEndereco = new endereco();
                if (vetorString.length != 8) {
                    throw new Exception("Faltam dados na String");
                }
                objetoTelefone.setDDI(Integer.parseInt(vetorString[0]));
                objetoTelefone.setDDD(Integer.parseInt(vetorString[0]));
                objetoTelefone.setNumero(Integer.parseInt(vetorString[0]));
                objetoTelefone.setTipo(tiposTelefone.valueOf(vetorString[0]));
                objetoCliente.setID(Integer.parseInt(vetorString[1]));
                objetoEndereco.setBairro(vetorString[2]);
                objetoEndereco.setCidade(vetorString[2]);
                objetoEndereco.setLogradouro(vetorString[2]);
                objetoEndereco.setEstado(vetorString[2]);
                objetoEndereco.setCep(Integer.parseInt(vetorString[2]));
                objetoEndereco.setNumero(Integer.parseInt(vetorString[2]));
                objetoEndereco.setComplemento(vetorString[2]);
                objetoEndereco.setTipo(tipoLogradouro.valueOf(vetorString[2]));
                objetoCliente.setCPF_CNPJ(vetorString[3]);
                objetoCliente.setDataNascimento((vetorString[4]));
                objetoCliente.setEmail(vetorString[5]);
                objetoCliente.setRazaoSocial(vetorString[6]);
                objetoCliente.setTipoCliente(tipoCliente.valueOf(vetorString[7]));

            }
            br.close();
            return listaCliente;

        } catch (Exception erro) {
            throw erro;
        }

    }

}
        

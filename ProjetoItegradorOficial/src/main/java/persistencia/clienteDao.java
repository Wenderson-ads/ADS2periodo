package persistencia;

import java.util.ArrayList;
import classes.cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import classes.pessoaPrincipal;

public class clienteDao extends pessoaPrincipal implements iClienteDao {

    private String nomeDoArquivoNoDisco = "Cliente.txt";

    public clienteDao() {
    }
    public clienteDao(String nomeCompleto, String telefone, String email, String CPF, long CEP, String logradouro, String bairro, String quadra, String lote) throws Exception {
        super(nomeCompleto, telefone, email, CPF, CEP, logradouro, bairro, quadra, lote);
    }

    @Override
    public void incluir(cliente objeto) throws Exception {
        try {
            int id = GeradorIdentificador.getID();
            objeto.setId(id);
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(cliente objeto, int id) throws Exception {

        excluir(id);
        incluir(objeto);

    }

    @Override
    public void excluir(int id) throws Exception {
        try {
            ArrayList<cliente> listaDeclientes = null;
            listaDeclientes = obterclientes();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaDeclientes.size(); i++) {

                if (listaDeclientes.get(i).getId() != id) {
                    bw.write(listaDeclientes.get(i).toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erro) {

            throw erro;
        }

    }

    @Override
    public cliente consultar(int id) throws Exception {
        try {
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                cliente objCliente = new cliente();
                String vetorString[] = linha.split(";");
                if (vetorString.length != 5) {
                    throw new Exception("Faltam dados na String");
                }
                objCliente.setId(Integer.parseInt(vetorString[0]));
                objCliente.setnomeCompleto(vetorString[1]);
                objCliente.setTelefone(Integer.parseInt(vetorString[2]));
                objCliente.setEmail(vetorString[3]);
                objCliente.setEndereco(vetorString[4]);
                if (objCliente.getId() == id) {
                    br.close();
                    return objCliente;
                }
            }
            br.close();
            throw new Exception("ID não existe");
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<cliente> obterclientes() throws Exception {
        try {
            ArrayList<cliente> listaDeclientes = new ArrayList<cliente>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                cliente obCliente = new cliente();
                String vetorString[] = linha.split(";");
                if (vetorString.length != 5) {
                    throw new Exception("Faltam dados na String");
                }
                obCliente.setId(Integer.parseInt(vetorString[0]));
                obCliente.setNomeCompleto(vetorString[1]);
                obCliente.setTelefone(Integer.parseInt(vetorString[2]));
                obCliente.setEmail(vetorString[3]);
                obCliente.setEndereco(vetorString[4]);
                listaDeclientes.add(obCliente);
            }
            br.close();
            return listaDeclientes;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<cliente> obterClientes() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

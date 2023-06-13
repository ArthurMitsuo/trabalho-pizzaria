package com.arthur;
import entities.DAO.UsuarioDAO;
import entities.Usuarios.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UsuarioDAO uDAO = new UsuarioDAO();
        Cliente c1 = new Cliente("Arthur", "000000000", "(41)089080808", "21/08/1996", "891283913", "Rua canada", 809);
        uDAO.salvarPessoa(c1);
        
    }
}

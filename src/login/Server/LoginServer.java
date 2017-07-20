/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Server;

/**
 *
 * @author LENOVO
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import login.Implement.LoginImplement;
public class LoginServer 
{
    public static void main(String args[])
            
    {
        try
        {
        Registry reg=LocateRegistry.createRegistry(1099);    
        LoginImplement lp=new LoginImplement(); 
        reg.rebind("login", lp);
        System.out.println("Server is ready");
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin; 

import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

/**
 *
 * @author dean
 */
public class AppLogin {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.setProperty("java.security.auth.login.config", "jaas.config");
         String name="name";
    String pwd ="psswd";
        try{
        LoginContext lc = new LoginContext("Test", new TestCallbackHandler(name, pwd));
        lc.login();
    }catch(LoginException e){
       e.printStackTrace(); 
    }
    
}
}

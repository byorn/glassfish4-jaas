/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myloginmodule;

import com.sun.appserv.security.AppservPasswordLoginModule;
import javax.security.auth.login.LoginException;




/**
 *
 * @author Byorn
 */
public class MyLoginModule extends AppservPasswordLoginModule{

    
    public MyLoginModule() {
      System.out.println("MyRealm LoginModule - Construction");
   }
    
    @Override
    protected void authenticateUser() throws LoginException {
        System.out.println("Going to Log In ............................");
        String userString = _username;
        String[] groups = {"admin"};
        commitUserAuthentication(groups);
        
    }

   
   

    
    
}

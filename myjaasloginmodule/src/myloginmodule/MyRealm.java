/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myloginmodule;
import com.sun.appserv.security.AppservRealm;
import com.sun.enterprise.security.auth.realm.BadRealmException;
import com.sun.enterprise.security.auth.realm.InvalidOperationException;
import com.sun.enterprise.security.auth.realm.NoSuchRealmException;
import com.sun.enterprise.security.auth.realm.NoSuchUserException;
import java.util.*;





/**
 *
 * @author Byorn
 */
public class MyRealm extends AppservRealm{
private static final String JAAS_CONTEXT="jaas-context";
     

@Override
   public void init(Properties properties) throws BadRealmException, NoSuchRealmException {
 
       System.out.println("Init MyRealm");
 
       // Pass the properties declared in the console to the system
       String propJaasContext=properties.getProperty(JAAS_CONTEXT);
       if (propJaasContext!=null) {
          setProperty(JAAS_CONTEXT, propJaasContext);
       }
   }
    
    @Override
    public String getAuthType() {
       return "WebAuthorization";
    }

    @Override
    public Enumeration getGroupNames(String string) throws InvalidOperationException, NoSuchUserException {
      // return Collections.enumeration(getGroups());
        return null;
    }
//    public static List<String> getGroups(){
//        List<String> s = new ArrayList<>();
//        s.add("admin");
//        return s;
//    }

    
}

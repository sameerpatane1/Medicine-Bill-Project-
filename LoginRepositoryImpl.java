package org.medicinepharma.admin.repository;

import org.medicinepharma.admin.config.DBConfig;
import org.medicinepharma.admin.model.LoginModel;

public class LoginRepositoryImpl extends DBConfig implements LoginRepository {

    @Override
    public boolean isuserLogin(LoginModel model) {
        try {
           
            stmt = conn.prepareStatement("select * from userlogin where email_id = ? AND password = ?");
            stmt.setString(1, model.getEmailid());
            stmt.setString(2, model.getPassword());
            rs = stmt.executeQuery();

            
            if (rs.next()) {
                return true;
            } else {
                return false; 
            }
        } catch (Exception ex) {
            System.out.println("Error is: " + ex);
            return false;
        }
    }
}

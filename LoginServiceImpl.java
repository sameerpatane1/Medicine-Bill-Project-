package org.medicinepharma.admin.service;

import org.medicinepharma.admin.model.LoginModel;
import org.medicinepharma.admin.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService {
  LoginRepositoryImpl Repo=new LoginRepositoryImpl();
	@Override
	public boolean isuserLogin(LoginModel model) {
		
		return Repo.isuserLogin(model);
	}

}

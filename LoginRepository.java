package org.medicinepharma.admin.repository;

import org.medicinepharma.admin.model.LoginModel;

public interface LoginRepository {
	public boolean  isuserLogin(LoginModel model);
}

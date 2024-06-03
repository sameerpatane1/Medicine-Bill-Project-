package org.medicinepharma.admin.service;



import java.util.List;

import org.medicinepharma.admin.model.RetailerModel;
import org.medicinepharma.admin.repository.RetailerRepositoryImpl;

public class RetailerServiceImpl implements  RetailerService {
	RetailerRepositoryImpl Repo=new RetailerRepositoryImpl();

	@Override
	public boolean isaddRetailer(RetailerModel model) {
		
		return Repo.isaddRetailer(model);
	}

	@Override
	public List<RetailerModel> getAllRetailer() {
		
		return Repo.getAllRetailer();
	}

	@Override
	public boolean isdeleteAllRetailerById(int retid) {
		
		return Repo.isdeleteAllRetailerById(retid);
	}

	@Override
	public boolean isupdateRetailer(RetailerModel model) {
		
		return Repo.isupdateRetailer(model);
	}

	

}

package org.medicinepharma.admin.repository;

import java.util.List;

import org.medicinepharma.admin.model.RetailerModel;

public interface RetailerRepository {
	public boolean isaddRetailer(RetailerModel model);
	public List<RetailerModel>getAllRetailer();
	public boolean isdeleteAllRetailerById(int retid);
	public boolean isupdateRetailer(RetailerModel model);
}

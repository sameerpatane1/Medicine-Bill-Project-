package org.medicinepharma.admin.service;

import java.util.List;

import org.medicinepharma.admin.model.RetailerModel;

public interface RetailerService {
public boolean isaddRetailer(RetailerModel model);
public List<RetailerModel>getAllRetailer();
public boolean isdeleteAllRetailerById(int retid);
public boolean isupdateRetailer(RetailerModel model);
}

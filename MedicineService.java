package org.medicinepharma.admin.service;

import java.util.List;

import org.medicinepharma.admin.model.MedicineModel;

public interface MedicineService {
public boolean isAddcompanyName(MedicineModel model);
public List<MedicineModel>getAllCompanyName();
public boolean isDeleteCompanyNameById(int cid);
public boolean isUpdateCompanyName(MedicineModel model);
}

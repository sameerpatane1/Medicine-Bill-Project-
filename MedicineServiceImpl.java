package org.medicinepharma.admin.service;

import java.util.List;

import org.medicinepharma.admin.model.MedicineModel;
import org.medicinepharma.admin.repository.MedicineRepository;
import org.medicinepharma.admin.repository.MedicineRepositoryImpl;

public class MedicineServiceImpl implements MedicineService {
	 MedicineRepository mRepo=new MedicineRepositoryImpl();
	@Override
	public boolean isAddcompanyName(MedicineModel model) {
		
		return mRepo.isAddcompanyName(model);
	}
	@Override
	public List<MedicineModel> getAllCompanyName() {
		
		return mRepo.getAllCompanyName();
	}
	@Override
	public boolean isDeleteCompanyNameById(int cid) {
		
		return mRepo.isDeleteCompanyNameById(cid);
	}
	@Override
	public boolean isUpdateCompanyName(MedicineModel model) {
		
		return mRepo.isUpdateCompanyName(model);
	}
	

}

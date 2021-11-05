package com.rapidpay.ceb.service.custom.impl;

import java.util.List;
import java.util.Optional;

import com.rapidpay.ceb.model.CebUser;
import com.rapidpay.ceb.repo.custom.CebUserRepo;
import com.rapidpay.ceb.service.custom.CebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CebUserServiceImpl implements CebUserService {

    @Autowired
    private CebUserRepo cebRepo;

    @Override
    public List<CebUser> getAllCebUsers() throws Exception {
        return cebRepo.findAll();
    }

    @Override
    public Optional<CebUser> getCebUser(int id) throws Exception {
        return cebRepo.findById(id);
    }

    @Override
    public CebUser saveCebUser(CebUser cebUser) throws Exception {
        return cebRepo.save(cebUser);
    }

    @Override
    public void updateCebUser(CebUser cebUser) throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteCebUser(int id) throws Exception {
        // TODO Auto-generated method stub

    }

}

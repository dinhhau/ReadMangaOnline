package com.aptech.serviceIml;

import com.aptech.dao.TblUserDAO;
import com.aptech.model.TblUserEntity;
import com.aptech.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblUserServiceIml implements TblUserService {

    @Autowired
    TblUserDAO tblUserDAO;

    @Override
    public List<TblUserEntity> getList() {

        return tblUserDAO.list();
    }
    @Override
    public TblUserEntity save(TblUserEntity entity){
        return tblUserDAO.save(entity);
    }
}

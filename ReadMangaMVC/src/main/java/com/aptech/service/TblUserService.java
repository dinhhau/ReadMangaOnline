package com.aptech.service;

import com.aptech.model.TblUserEntity;

import java.util.List;

public interface TblUserService {
    List<TblUserEntity> getList();
     TblUserEntity save( TblUserEntity entity);
}

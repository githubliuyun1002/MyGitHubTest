package com.xiabuxiabu.hibernate.hibernate_demo.service;

import com.xiabuxiabu.hibernate.hibernate_demo.dao.TableDao;
import com.xiabuxiabu.hibernate.hibernate_demo.entity.TableEntity;
import javafx.scene.control.Tab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    @Autowired
    private TableDao tableDao;
    //通过id查询
    public TableEntity findOne(Long id){
        return tableDao.findById(id).get();
    }
    //通过姓名查询
    public TableEntity findUserName(@Param("name")String name){
        return  tableDao.findUserName(name);
    }
    //add
    public TableEntity save(TableEntity table){
        return tableDao.save(table);
    }
    //find
    public List<TableEntity> allMsg(){
        return tableDao.findAll();
    }
    //delete
    public void deleteById(Long id){
        tableDao.deleteById(id);
    }
    //update
    public void updateById(Long id,String address){
        tableDao.updateById(id,address);
    }


}

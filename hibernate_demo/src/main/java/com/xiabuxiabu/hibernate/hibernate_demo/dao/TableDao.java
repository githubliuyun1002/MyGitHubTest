package com.xiabuxiabu.hibernate.hibernate_demo.dao;

import com.xiabuxiabu.hibernate.hibernate_demo.entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslUtils;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TableDao extends JpaRepository<TableEntity,Long> {
    @Query("select t from TableEntity t where t.userName=:name")
    public TableEntity findUserName(@Param("name")String name);
    @Query("update TableEntity t set address=:address where id=:id")
    public TableEntity updateById(@Param("id") Long id,@Param("address") String address);

}

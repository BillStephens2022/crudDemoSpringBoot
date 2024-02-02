package com.billstephens.crudDemoSpringBoot.dao;

import com.billstephens.crudDemoSpringBoot.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}

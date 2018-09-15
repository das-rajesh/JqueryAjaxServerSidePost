/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajesh.entity.dao.impl;

import com.rajesh.entity.Customer;
import com.rajesh.entity.dao.CustomerDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Raja", "raja@gmail.com", true));
        list.add(new Customer(2, "Rajesh", "rajesh@gmail.com", true));
        list.add(new Customer(3, "Babu", "babu@gmail.com", true));
        list.add(new Customer(4, "Das", "das@gmail.com", true));

        return list;
    }

    @Override
    public Customer getById(int id) {
        for (Customer c : getAll()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

}

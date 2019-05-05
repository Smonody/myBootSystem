package smonody.servies.impl;

import smonody.dao.CustomerDao;
import smonody.pojo.Customer;
import smonody.servies.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerDaoImpl implements CustomerService {
    //注解注入CustomerDao
    @Autowired
    private CustomerDao customerDao;
    //查询客户
    public Customer findCustomerById(Integer id) {
        return customerDao.findCustomerById(id);
    }
}

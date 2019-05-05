package smonody.dao;

import smonody.pojo.Customer;

public interface CustomerDao {
    /*
    * 根据id查询信息
    * */
    Customer findCustomerById(Integer id);
}

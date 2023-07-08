package in.ayush.dao;

import org.springframework.data.repository.CrudRepository;

import in.ayush.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}

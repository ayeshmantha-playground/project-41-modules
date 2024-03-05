package lk.ijse.project_d.controller;

import lk.ijse.project_d.aop.*;
import lk.ijse.project_c.repo.CustomerRepo;
import lk.ijse.project_b.util.Transformer;
public class CustomerController {
    CustomerAop customerAop = new CustomerAop();
    CustomerRepo customerRepo = new CustomerRepo();
    Transformer transformer = new Transformer();

    
}
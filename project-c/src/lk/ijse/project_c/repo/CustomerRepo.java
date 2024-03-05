package lk.ijse.project_c.repo;

import lk.ijse.project_c.security.Repository;
import lk.ijse.project_b.service.CustomerService;
import lk.ijse.project_e.component.CustomerComponent;
import lk.ijse.project_f.config.*;
public class CustomerRepo {
    Repository repository = new Repository();
    CustomerService customerService = new CustomerService();
    CustomerComponent component = new CustomerComponent();
    AppConfig appConfig = new AppConfig();
}

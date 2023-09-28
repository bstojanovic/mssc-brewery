package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID Id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("John Buck")
                .build();
    }
}

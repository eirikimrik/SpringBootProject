package com.springboot.newtry.Service;

import com.springboot.newtry.Entity.Admin;
import com.springboot.newtry.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImplementation implements AdminService{

    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}

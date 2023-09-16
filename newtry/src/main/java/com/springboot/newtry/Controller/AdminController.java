package com.springboot.newtry.Controller;


import com.springboot.newtry.Entity.Admin;
import com.springboot.newtry.Service.AdminService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    private AdminService adminService;

    @PostMapping("/add")
    public String addUser(@RequestBody Admin admin) {
        adminService.saveAdmin(admin);
        return "User added successfully";
    }


}

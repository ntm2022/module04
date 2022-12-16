package com.cg.thcustomer.controller;

import com.cg.thcustomer.model.Customer;
import com.cg.thcustomer.service.CustomerService;
import com.cg.thcustomer.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping({"/customer", "/"})
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();

    @GetMapping("")
    public String index(Model model) {

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {

        model.addAttribute("customer", customerService.findById(id));
        return "/view";
    }

    //gọi FORM CREATE
    //CREATE và SAVE là 01 cặp
    @GetMapping("/create")
    public String create(Model model) {

        model.addAttribute("customer", new Customer());
        return "/create";
    }

    //Tạo mới 01 customer
    @PostMapping("/save")
    public String save(Customer customer) {

        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/customer";
    }

    //gọi FORM EDIT
    //EDIT & UPDATE là 01 cặp
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {

        model.addAttribute("customer", customerService.findById(id));
        return "/edit";
    }

    //Cập nhật 01 customer
    @PostMapping("/update")
    public String update(Customer customer) {

        customerService.update(customer.getId(), customer);
        return "redirect:/customer";
    }

    //gọi FORM XÓA (POST)
    //02 em DELETE này là 01 cặp
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {

        model.addAttribute("customer", customerService.findById(id));
        return "/delete";
    }

    //FORM CONFIRM XÓA thực sự
    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {

        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }

}


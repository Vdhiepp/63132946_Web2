package hiepvd.QuanLyNhanVien.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hiepvd.QuanLyNhanVien.models.Users;
import hiepvd.QuanLyNhanVien.services.UsersService;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired UsersService usersService; 
	
	@GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        List<Users> users = usersService.getUsersByUserName(username);
        boolean isAuthenticated = false;
        Users authenticatedUser = null;

        for (Users user : users) {
            if (user.getPass().equals(password)) {
                isAuthenticated = true;
                authenticatedUser = user;
                break;
            }
        }

        if (isAuthenticated && authenticatedUser != null) {
            session.setAttribute("authenticatedUser", authenticatedUser); // Lưu thông tin người dùng vào session
            if ("Admin".equals(authenticatedUser.getQuyen())) {
                return "admin"; 
            } else if ("Nhân viên".equals(authenticatedUser.getQuyen())) {
                return "nhanvien"; 
            } else {
                
               
                return "login";
            }
        } else {
            
            return "login";
        }
    }

    @GetMapping("/dsNguoiDung")
	public String getAllUsers(Model model) {
		List<Users> dsND = usersService.getAllUsers();
		model.addAttribute("dsND", dsND);
		return "danhsachND";
	}
    
    @GetMapping("/themND")
    public String themUserForm(Model model) {
        model.addAttribute("user", new Users());
        return "themND";
    }

    @PostMapping("/themND")
    public String themUser(@ModelAttribute Users user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "themND"; 
        }

        usersService.saveUser(user);
        return "redirect:/dsNguoiDung";
    }

    @GetMapping("/suaND/{id}")
    public String suaUserForm(@PathVariable("id") int id, Model model) {
        Optional<Users> optionalUser = usersService.getUsersById(id);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            model.addAttribute("user", user);
            return "suaND";
        } else {
            return "redirect:/dsNguoiDung";
        }
    }

    @PostMapping("/suaND")
    public String suaUser(@RequestParam("id") int id, Users user) {
        user.setId(id);
        usersService.saveUser(user);
        return "redirect:/dsNguoiDung";
    }

    @GetMapping("/xoaND/{id}")
    public String xoaUser(@PathVariable("id") int id) {
        usersService.deleteUsersById(id);
        return "redirect:/dsNguoiDung";
    }

    
}

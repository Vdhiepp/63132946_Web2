package hiepvd.QuanLyNhanVien.controllers;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

//import ch.qos.logback.core.model.Model;
//import hiepvd.QuanLyNhanVien.models.Users;
//import hiepvd.QuanLyNhanVien.services.UsersService;
//import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
//	@Autowired UsersService usersService; 
//	
//	@GetMapping("/login")
//    public String login() {
//        return "login";
//    }
    
//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
//        List<Users> users = usersService.getUsersByUserName(username);
//        boolean isAuthenticated = false;
//        Users authenticatedUser = null;
//
//        for (Users user : users) {
//            if (user.getPass().equals(password)) {
//                isAuthenticated = true;
//                authenticatedUser = user;
//                break;
//            }
//        }
//
//        if (isAuthenticated && authenticatedUser != null) {
//            session.setAttribute("authenticatedUser", authenticatedUser); 
//            if ("Admin".equals(authenticatedUser.getQuyen())) {
//                return "index"; 
//            } else if ("Nhân viên".equals(authenticatedUser.getQuyen())) {
//                return "danhsachNV"; 
//            } else {
//                
//                model.addAttribute("error", "Không có quyền truy cập phù hợp!");
//                return "login";
//            }
//        } else {
//            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu sai!");
//            return "dangnhap/sign_in";
//        }
//    }

}

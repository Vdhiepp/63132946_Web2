package hiepvd.QuanLyNhanVien.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hiepvd.QuanLyNhanVien.services.EmailService;

@Controller
public class SendMailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmailForm")
    public String showForm() {
        return "guiMail";
    }

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestParam String toEmail,
                            @RequestParam String subject,
                            @RequestParam String body,
                            Model model) {
        emailService.sendSimpleEmail(toEmail, subject, body);
        model.addAttribute("message", "Email đã được gửi thành công!");
        return "result";
    }
}
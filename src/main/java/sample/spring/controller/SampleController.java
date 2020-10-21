package sample.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.boot.*;
// import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String home(@RequestParam(name="message", required=false, defaultValue="World") String message, Model uiModel) {
        uiModel.addAttribute("message", message);
        return "Sample";
    }
}
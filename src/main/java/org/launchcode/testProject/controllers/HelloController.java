package org.launchcode.testProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {
//
//    // Handles request at path /hello
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//    // lives /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye Spring!";
//    }
//
//    // lives /hello
//    // Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//
//
//    public static String createMessage(String nameEntered, String languageSelection) {
//
//        String greeting = "";
//
//        if (languageSelection.equals("english")) {
//            greeting = "Hello";
//        } else if (languageSelection.equals("french")) {
//            greeting = "Bonjour";
//        } else if (languageSelection.equals("german")) {
//            greeting = "Hallo";
//        } else if (languageSelection.equals("spanish")) {
//            greeting = "Hola";
//        } else if (languageSelection.equals("italian")) {
//            greeting = "Ciao";
//        }
//        return greeting + " " + nameEntered;
//    }
//
//    // Handles request of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    @PostMapping("helloForm")
//    public String helloWithRequestParam(@RequestParam String name, String language) {
//    //public String helloWithPathParam(@PathVariable String name, String language) {
//        return createMessage(name, language);
//    }
//
//    // lives /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                    "<body>" +
//                        "<form action='helloForm'>" + // submit a request to /hello
//                            "<input type='text' name='name' method='post'>" +
//                            "<select name='language'>" +
//                                "<option value=''>--Please choose an option--</option>" +
//                                "<option value='english'>English</option>" +
//                                "<option value='french'>French</option>" +
//                                "<option value='german'>German</option>" +
//                                "<option value='spanish'>Spanish</option>" +
//                                "<option value='italian'>Italian</option>" +
//                            "</select>" +
//                            "<input type='submit' value='Greet me!'>" +
//                        "</form>" +
//                    "</body>" +
//                "</html>";
//    }


//}

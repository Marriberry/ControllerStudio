package org.launchcode.testProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping()
    @ResponseBody
    public String showLanguages() {
        String html =
                "<h1>Skills</h1>" +
                        "<h2>List of available skills below</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<form action='codingSurvey' method='post'>" +
                            "<label for='name-input'>Name</label><br/>" +
                            "<input id='name-input' type='text' name='name' method='post'><br/><br/>" +

                            "<label for='language-input'>My favorite language:</label><br/>" +
                            "<select id='language-input' name='codingLanguageFavorite'>" +
                                "<option value=''>--Please choose an option--</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select><br/><br/>" +

                            "<label for='language-input'>My second favorite language:</label><br/>" +
                            "<select id='language-input' name='codingLanguageSecond'>" +
                            "<option value=''>--Please choose an option--</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='python'>Python</option>" +
                            "</select><br/><br/>" +

                            "<label for='language-input'>My third favorite language:</label><br/>" +
                            "<select id='language-input' name='codingLanguageThird'>" +
                            "<option value=''>--Please choose an option--</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='python'>Python</option>" +
                            "</select><br/><br/>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("codingSurvey")
    @ResponseBody
    public String returnForm(@RequestParam String name, @RequestParam String codingLanguageFavorite, @RequestParam String codingLanguageSecond, @RequestParam String codingLanguageThird) {
        //return name + "\n" + codingLanguageFavorite + "\n" + codingLanguageSecond + "\n" + codingLanguageThird;
        String returnhtml =
                "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + codingLanguageFavorite + "</li>" +
                        "<li>" + codingLanguageSecond + "</li>" +
                        "<li>" + codingLanguageThird + "</li>" +
                        "</ol>";
        return returnhtml;
    }
}

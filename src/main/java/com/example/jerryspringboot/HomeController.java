package com.example.jerryspringboot;

import com.example.jerryspringboot.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/course-list")
    public String showCourseList(Model model) {
        List<Course> list = new ArrayList<>();
        courseRepository.findAll().forEach(list::add);

        model.addAttribute("courseList", list);
        return "course-list";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestParam("id") String param) {
        try {
            int id = Integer.parseInt(param);
            return "Registered for course id: " + id;
        } catch (Exception e) {
            return "Invalid or missing course id parameter: " + param;
        }
    }
}

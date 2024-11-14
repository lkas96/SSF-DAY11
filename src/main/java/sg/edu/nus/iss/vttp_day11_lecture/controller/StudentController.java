package sg.edu.nus.iss.vttp_day11_lecture.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;

import sg.edu.nus.iss.vttp_day11_lecture.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    List<Student> students = new ArrayList<>();

    @ResponseBody
    @RequestMapping(path = "/allStudents", method = RequestMethod.GET)
    public List<Student> getStudentList() throws ParseException {

        // time formattor custom
        String dob = "01 Dec 1990 10:19:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.sss zzz");
        Date dobb = sdf.parse(dob);
        Long epochDob = dobb.getTime();

        Student s1 = new Student(001, "Singapore", "SG", epochDob, "NUSISS@email.com", "123 NUS ISS CAMPUS");
        students.add(s1);
        Student s2 = new Student(002, "Philippines", "PH", epochDob, "NTU@email.com", "456 NTU CAMPUS");
        students.add(s2);
        Student s3 = new Student(003, "Indonesia", "ID", epochDob, "SIM@email.com", "999 SIM GE CAMPUS");
        students.add(s3);

        return students;
    }
}

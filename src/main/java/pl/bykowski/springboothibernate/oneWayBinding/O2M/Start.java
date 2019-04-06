package pl.bykowski.springboothibernate.oneWayBinding.O2M;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashSet;
import java.util.Set;

@RestController("studens")
public class Start {

    private StudentRepo studentRepo;
    private TeacherRepo teacherRepo;

    @Autowired
    public Start(StudentRepo studentRepo, TeacherRepo teacherRepo) {
        this.studentRepo = studentRepo;
        this.teacherRepo = teacherRepo;
    }

    @GetMapping("/addStudentAndTeacher")
    public void init() {
        Student student1 = new Student("Adas");
        Student student2 = new Student("Adas");
        Teacher teacher = new Teacher("Pan Kleks");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        teacher.setStudentSet(students);
        studentRepo.save(student1);
        studentRepo.save(student2);
        teacherRepo.save(teacher);


    }
}

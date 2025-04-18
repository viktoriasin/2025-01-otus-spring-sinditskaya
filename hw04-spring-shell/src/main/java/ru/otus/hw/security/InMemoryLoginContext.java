package ru.otus.hw.security;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.otus.hw.domain.Student;

import static java.util.Objects.nonNull;

@Component
public class InMemoryLoginContext implements LoginContext {

    private Student student;

    @Override
    public void login(Student student) {
        this.student = student;
    }

    @Override
    public boolean isStudentLoggedIn() {
        return nonNull(student);
    }

    @Override
    public Student getCurrentLoggedInStudent() {
        return student;
    }
}

package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class PersonService {

    private final PersonRepository personRepo;

}

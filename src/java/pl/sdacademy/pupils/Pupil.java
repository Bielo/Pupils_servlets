package pl.sdacademy.pupils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pupil {

    private int id;
    private String name;
    private char classLetter;
    private int classNumber;
    private int absenceCount;

}

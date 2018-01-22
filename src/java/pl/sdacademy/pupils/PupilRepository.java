package pl.sdacademy.pupils;

import java.util.List;
import java.util.Optional;

public interface PupilRepository {

    List<Pupil> findAllPupils();

    Optional<Pupil> findPupilById(int id);

    void deletePupilbyId(int id);

    List<Pupil> findPupilByClass(String classLetter, int classNumber);

}

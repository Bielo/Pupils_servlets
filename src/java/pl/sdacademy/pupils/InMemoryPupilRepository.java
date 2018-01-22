package pl.sdacademy.pupils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryPupilRepository implements PupilRepository {

    @Override
    public List<Pupil> findAllPupils() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Pupil> findPupilById(int id) {
        return Optional.empty();
    }

    @Override
    public void deletePupilbyId(int id) {

    }

    @Override
    public List<Pupil> findPupilByClass(String classLetter, int classNumber) {
        return new ArrayList<>();
    }
}

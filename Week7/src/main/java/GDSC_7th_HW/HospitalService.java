package GDSC_7th_HW;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public void createHospital(CreateHospitalDto createHospitalDto){
        hospitalRepository.save(new Hospital(createHospitalDto.getName()));
    }

    public List<Hospital> getAllHospitals(){
        return hospitalRepository.findAll();
    }
}

package GDSC_7th_HW;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping()
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();
    }

    @PostMapping()
    public void createHospital(@RequestBody CreateHospitalDto createHospitalDto){
        hospitalService.createHospital(createHospitalDto);
    }
}

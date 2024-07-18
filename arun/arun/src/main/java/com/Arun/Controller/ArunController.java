package com.Arun.Controller;

import com.Arun.Dto.ArunDto;
import com.Arun.Service.Arun;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArunController {
    private Arun arun ;

    public ArunController(Arun arun) {
        this.arun = arun;
    }
    //http://localhost:8080/addAruns
    @PostMapping("/addAruns")
    public ResponseEntity<ArunDto> addArun(@RequestBody ArunDto dto){
        ArunDto arunDto = arun.addArun(dto);
        return new ResponseEntity<>(arunDto, HttpStatus.CREATED);
    }
}

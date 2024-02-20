package com.evertong.certification.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.evertong.certification.modules.students.UseCases.StudentCertificationAnswersUseCase;
import com.evertong.certification.modules.students.UseCases.VerifyIfHasCertificationUseCase;
import com.evertong.certification.modules.students.dto.StudentCertificationAnswerDTO;
import com.evertong.certification.modules.students.dto.VerifyHasCertificationDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/students")
public class StudentController {

    //Necessário usar  o USECASE
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    
    @Autowired
    private StudentCertificationAnswersUseCase studentCertificationAnswersUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "Usuário já fez a prova";
        }else{
            return "Usuário pode fazer a prova";
        }
    }

    @PostMapping("/certification/answer")
    public ResponseEntity<Object> certificationAnswer(
            @RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO) {
        try {
            var result = studentCertificationAnswersUseCase.execute(studentCertificationAnswerDTO);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

}

package com.evertong.certification.modules.certifications.controllers.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evertong.certification.modules.students.entities.CertificationStudentEntity;
import com.evertong.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingUseCase {
    
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public List<CertificationStudentEntity> execute() {
        return this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
    }
}

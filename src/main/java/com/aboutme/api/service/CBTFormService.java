package com.aboutme.api.service;

import com.aboutme.api.exception.CBTFormException;
import com.aboutme.api.model.CBTForm;
import com.aboutme.api.repository.CBTFormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CBTFormService {
    private final CBTFormRepository cbtFormRepository;

    public CBTForm read(String id){
        return cbtFormRepository.findById(id).orElseThrow(()-> { return new CBTFormException("CBTForm not found");});
    }

    public CBTForm save(CBTForm cbtForm){
        return cbtFormRepository.save(cbtForm);
    }

    public void deleteById(String id){
        cbtFormRepository.deleteById(id);
    }


}

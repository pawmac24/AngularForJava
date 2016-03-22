package com.pm.mycompany.service;

import com.pm.mycompany.dto.CompanyCreateDTO;
import com.pm.mycompany.dto.CompanyUpdateDTO;
import com.pm.mycompany.dto.primarykey.CompanyPrimaryKeyDTO;
import com.pm.mycompany.dto.result.CompanyResultDTO;
import com.pm.mycompany.exception.BusinessValidationException;

import java.util.List;

/**
 * Created by pmackiewicz on 2015-11-04.
 */
public interface CompanyService {

    CompanyPrimaryKeyDTO create(CompanyCreateDTO companyDTO) throws BusinessValidationException;

    void update(Long companyId, CompanyUpdateDTO companyDTO) throws BusinessValidationException;

    CompanyResultDTO find(Long companyId) throws BusinessValidationException;

    void delete(Long customerId) throws BusinessValidationException;

    List<CompanyResultDTO> findAll();
}

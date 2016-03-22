package com.pm.mycompany.service;

import com.pm.mycompany.dto.CompanyCreateDTO;
import com.pm.mycompany.dto.CompanyUpdateDTO;
import com.pm.mycompany.dto.primarykey.CompanyPrimaryKeyDTO;
import com.pm.mycompany.dto.result.CompanyResultDTO;
import com.pm.mycompany.exception.BusinessValidationException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pmackiewicz on 2015-11-04.
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService{

    public final static Logger logger = Logger.getLogger(CompanyServiceImpl.class);

    @Override
    public CompanyPrimaryKeyDTO create(CompanyCreateDTO companyDTO) throws BusinessValidationException {
        logger.info("create company");
        CompanyPrimaryKeyDTO companyPKeyDTO = new CompanyPrimaryKeyDTO(10L);
        return companyPKeyDTO;
    }

    @Override
    public void update(Long companyId, CompanyUpdateDTO companyDTO) throws BusinessValidationException {
        logger.info("update company");
    }

    @Override
    public CompanyResultDTO find(Long companyId) throws BusinessValidationException {
        CompanyResultDTO companyResultDTO = new CompanyResultDTO();
        return companyResultDTO;
    }

    @Override
    public void delete(Long companyId) throws BusinessValidationException {
        logger.info("delete " + companyId);
    }

    @Override
    public List<CompanyResultDTO> findAll() {
        List<CompanyResultDTO> customerResultDTOList = new ArrayList<>();
        return customerResultDTOList;
    }
}

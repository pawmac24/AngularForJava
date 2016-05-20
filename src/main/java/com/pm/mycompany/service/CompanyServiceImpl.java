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

    private List<CompanyResultDTO> companyResultDTOList = new ArrayList<>();
    private Long initialId = 10L;

    @Override
    public CompanyPrimaryKeyDTO create(CompanyCreateDTO companyDTO) throws BusinessValidationException {
        logger.info("create company");
        CompanyPrimaryKeyDTO companyPKeyDTO = new CompanyPrimaryKeyDTO(initialId);
        CompanyResultDTO companyResultDTO = new CompanyResultDTO();
        companyResultDTO.setName(companyDTO.getName());
        companyResultDTO.setCompanyId(companyPKeyDTO.getId());
        companyResultDTO.setAddress(companyDTO.getAddress());
        companyResultDTOList.add(companyResultDTO);
        initialId++;
        return companyPKeyDTO;
    }

    @Override
    public void update(Long companyId, CompanyUpdateDTO companyDTO) throws BusinessValidationException {
        logger.info("update company");
        for (CompanyResultDTO company: companyResultDTOList) {
            if (company.getCompanyId().equals(companyId)){
                company.setName(companyDTO.getName());
                company.setAddress(companyDTO.getAddress());
            }
        }
    }

    @Override
    public CompanyResultDTO find(Long companyId) throws BusinessValidationException {
        CompanyResultDTO companyResultDTO = new CompanyResultDTO();
        for (CompanyResultDTO company: companyResultDTOList) {
            if (company.getCompanyId().equals(companyId)){
                companyResultDTO = company;
            }
        }
        return companyResultDTO;
    }

    @Override
    public void delete(Long companyId) throws BusinessValidationException {
        logger.info("delete " + companyId);
        CompanyResultDTO companyResultDTO = null;
        for (CompanyResultDTO company: companyResultDTOList) {
            if (company.getCompanyId().equals(companyId)){
                companyResultDTO = company;
            }
        }
        if(companyResultDTO != null){
            companyResultDTOList.remove(companyResultDTO);
        }
    }

    @Override
    public List<CompanyResultDTO> findAll() {
        return companyResultDTOList;
    }
}

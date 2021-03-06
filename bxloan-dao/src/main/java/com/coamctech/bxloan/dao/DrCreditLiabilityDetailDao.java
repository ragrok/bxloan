package com.coamctech.bxloan.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.coamctech.bxloan.entity.DrCreditLiabilityDetail;

public interface DrCreditLiabilityDetailDao extends
PagingAndSortingRepository<DrCreditLiabilityDetail, Long>,
JpaSpecificationExecutor<DrCreditLiabilityDetail> {

}

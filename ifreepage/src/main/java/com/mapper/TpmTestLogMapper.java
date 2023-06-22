package com.mapper;

import com.model.TpmTestLog;
import org.springframework.stereotype.Repository;

/**
 * @TpmTestLogMapper
 * @Mapper
 * @version : Ver 1.0
 */
@Repository
public interface TpmTestLogMapper {

    Long insert(TpmTestLog tpmTestLog);

}
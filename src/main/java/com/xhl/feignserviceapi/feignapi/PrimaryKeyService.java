package com.xhl.feignserviceapi.feignapi;

import com.xhl.feignserviceapi.feigndto.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface PrimaryKeyService {

    @RequestMapping(value = "/api/segment/get")
    Result getSegmentPrimaryKey(@RequestParam String key);

    @RequestMapping(value = "/api/segment/getmore")
    Result getSegmentPrimaryKeys(@RequestParam String key,@RequestParam int size);

    @RequestMapping(value = "/api/snowflake/get")
    Result getSnowflakePrimaryKey(@RequestParam String key);

    @RequestMapping(value = "/api/snowflake/getmore")
    Result getSnowflakePrimaryKeys(@RequestParam String key,@RequestParam int size);

    @RequestMapping(value = "/api/snowflake/decodeSnowflakeId")
    Result  decodeSnowflakeId(@RequestParam String snowflakeIdStr);

}

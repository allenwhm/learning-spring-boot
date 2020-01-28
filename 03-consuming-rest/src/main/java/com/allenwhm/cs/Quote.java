package com.allenwhm.cs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author allenwhm
 * @date 2019-03-10 11:32
 **/
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;
}

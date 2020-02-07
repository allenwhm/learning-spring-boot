package com.alenwhm.rda;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author allenwhm
 * @date 2019-03-10 12:46
 **/
@Data
@AllArgsConstructor
public class Customer {
    private Long id;
    private String firstName, lastName;
}

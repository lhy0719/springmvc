package org.format.demo.service;


import com.jd.ofc.asyncservice.webservice.ProcessResult;
import org.format.demo.model.Dept;

import java.util.List;

public interface IDeptService {

    List<Dept> listAll();

    void saveOrUpdate(Dept dept);

    ProcessResult checkStockSplit(String split, String split1, String jsonStr);

    ProcessResult checkStockSplitJsf(String split, String split1, String jsonStr);
}

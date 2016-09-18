package org.format.demo.service.impl;

import com.jd.ofc.asyncservice.webservice.OrderSplitAsyncService;
import com.jd.ofc.asyncservice.webservice.ProcessResult;
import org.format.demo.dao.BaseDao;
import org.format.demo.model.Dept;
import org.format.demo.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService implements IDeptService {

    @Autowired
    private BaseDao baseDao;

    /*@Value("#{orderSplitAsyncServiceWS}")
    private OrderSplitAsyncService orderSplitAsyncService;*/

    @Autowired(required = false)
    private OrderSplitAsyncService orderSplitAsyncJsf;

    @Override
    public List<Dept> listAll() {
        return (List<Dept>)baseDao.listAll(Dept.class);
    }

    @Override
    public void saveOrUpdate(Dept dept) {
        baseDao.saveOrUpdate(dept);
    }

    @Override
    public ProcessResult checkStockSplit(String split, String split1, String jsonStr) {
//        return orderSplitAsyncService.checkStockSplit(split,split1,jsonStr);
        return null;
    }

    @Override
    public ProcessResult checkStockSplitJsf(String split, String split1, String jsonStr) {
        return orderSplitAsyncJsf.checkStockSplit(split,split1,jsonStr);
    }
}

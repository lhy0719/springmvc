package com.jd.ofc.asyncservice.webservice;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Description: 异步服务
 * @author 姜浩
 * @date 2014-12-25
 *
 */
@WebService(targetNamespace = "http://asyncservice.ofc.jd.com/", name = "OrderSplitAsyncService")
public interface OrderSplitAsyncService {

    /**
     * @Title: splitOrderByStock
     * @Description: 有货先发拆分
     * @param sysName 系统名称
     * @param sysKey 系统校验的key
     * @param splitContent 拆分参数
     * @return
     */
	@WebResult(name = "ProcessResult", targetNamespace = "http://asyncservice.ofc.jd.com/")
	@WebMethod(operationName = "splitOrderByStock", action = "http://asyncservice.ofc.jd.com/splitOrderByStock")
	ProcessResult splitOrderByStock(
			@WebParam(name = "sysName", targetNamespace = "http://asyncservice.ofc.jd.com/") String sysName,
			@WebParam(name = "sysKey", targetNamespace = "http://asyncservice.ofc.jd.com/") String sysKey,
			@WebParam(name = "splitContent", targetNamespace = "http://asyncservice.ofc.jd.com/") String splitContent);

	/**
     * @Title: splitOrderByCustom
     * @Description: 自定义拆分申请
     * @param customizeContent json参数
     * @return
     */
	@WebResult(name = "ProcessResult", targetNamespace = "http://asyncservice.ofc.jd.com/")
	@WebMethod(operationName = "splitOrderByCustom", action = "http://asyncservice.ofc.jd.com/splitOrderByCustom")
	ProcessResult splitOrderByCustom(
			@WebParam(name = "customizeContent", targetNamespace = "http://asyncservice.ofc.jd.com/") String customizeContent);
	 /**
     * @Title: checkStockSplit
     * @Description: 检查是否允许有货先发拆分
     * @param sysName 系统名称
     * @param sysKey 系统校验的key
     * @param splitContent 拆分参数
     * @return
     */
	@WebResult(name = "ProcessResult", targetNamespace = "http://asyncservice.ofc.jd.com/")
	@WebMethod(operationName = "checkStockSplit", action = "http://asyncservice.ofc.jd.com/checkStockSplit")
	ProcessResult checkStockSplit(
			@WebParam(name = "sysName", targetNamespace = "http://asyncservice.ofc.jd.com/") String sysName,
			@WebParam(name = "sysKey", targetNamespace = "http://asyncservice.ofc.jd.com/") String sysKey,
			@WebParam(name = "splitContent", targetNamespace = "http://asyncservice.ofc.jd.com/") String splitContent);

}

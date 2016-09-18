package com.jd.ofc.asyncservice.webservice;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>processResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="processResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optSucess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processResult", propOrder = {"optSucess","message","resultCode"})
public class ProcessResult implements Serializable {

	private static final long serialVersionUID = 1L;
	protected boolean optSucess;
    protected String message;
    protected int resultCode;

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * 获取optSucess属性的值。
     * 
     */
    public boolean isOptSucess() {
        return optSucess;
    }

    /**
     * 设置optSucess属性的值。
     * 
     */
    public void setOptSucess(boolean value) {
        this.optSucess = value;
    }

    /**
     * 获取resultCode属性的值。
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * 设置resultCode属性的值。
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}

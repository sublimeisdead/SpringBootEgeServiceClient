
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvType">
 *   &lt;restriction base="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-16">
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="UAT"/>
 *     &lt;enumeration value="EXUAT"/>
 *     &lt;enumeration value="SVCDEV"/>
 *     &lt;enumeration value="TCOD"/>
 *     &lt;enumeration value="PROD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
@XmlEnum
public enum EnvType {

    DEV,
    UAT,
    EXUAT,
    SVCDEV,
    TCOD,
    PROD;

    public String value() {
        return name();
    }

    public static EnvType fromValue(String v) {
        return valueOf(v);
    }

}

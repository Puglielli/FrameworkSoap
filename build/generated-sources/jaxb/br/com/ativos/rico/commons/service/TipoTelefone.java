//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.05 �s 05:25:01 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTelefone.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTelefone"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESIDENCIAL"/&gt;
 *     &lt;enumeration value="CELULAR"/&gt;
 *     &lt;enumeration value="COMERCIAL"/&gt;
 *     &lt;enumeration value="OUTRO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoTelefone")
@XmlEnum
public enum TipoTelefone {

    RESIDENCIAL,
    CELULAR,
    COMERCIAL,
    OUTRO;

    public String value() {
        return name();
    }

    public static TipoTelefone fromValue(String v) {
        return valueOf(v);
    }

}

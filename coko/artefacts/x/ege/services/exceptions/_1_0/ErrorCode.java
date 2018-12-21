
package coko.artefacts.x.ege.services.exceptions._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_UNIQUE_DATA_SOURCE_CODE"/>
 *     &lt;enumeration value="PATH_TO_FILE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_DIMENSIONS_EXCEPTION"/>
 *     &lt;enumeration value="WRONG_REGION_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_APPEAL_REQUEST_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_APPEAL_CANCEL_REQUEST_EXCEPTION"/>
 *     &lt;enumeration value="NOT_FOUND"/>
 *     &lt;enumeration value="EMPTY_DICTIONARY_CONTENT_REQUEST"/>
 *     &lt;enumeration value="EMPTY_REQUEST"/>
 *     &lt;enumeration value="UNKNOWN_REQUEST_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_SERVICE_CODE_EXCEPTION"/>
 *     &lt;enumeration value="EMAIL_FORMAT_EXCEPTION"/>
 *     &lt;enumeration value="PHONE_FORMAT_EXCEPTION"/>
 *     &lt;enumeration value="PASSPORT_SERIES_FORMAT__EXCEPTION"/>
 *     &lt;enumeration value="PASSPORT_NUMBER_FORMAT_EXCEPTION"/>
 *     &lt;enumeration value="SNILS_FORMAT_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_SERVICE_NAME_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_ID_APPLICATION_EXCEPTION"/>
 *     &lt;enumeration value="WRONG_DATE"/>
 *     &lt;enumeration value="EMPTY_DATE_APPLICATION_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_APP_TYPE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_SNILS_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_LAST_NAME_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_FIRST_NAME_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PASSPORT_SERIES_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PASSPORT_NUMBER_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PASSPORT_DATE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PASSPORT_ORG_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_APPLICANT_EQUALS_EXAMINEE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_YEAR_EXAM_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_CODE_SUBJECT_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_SUBJECT_TEXT_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_EXAM_DATE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_CODE_SCHOOL_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_SCHOOL_TEXT_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_CODE_PLACE_EXAM_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PLACE_EXAM_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PRESENCE_EXCEPTION"/>
 *     &lt;enumeration value="EMPTY_PRESENSE_TEXT_EXCEPTION"/>
 *     &lt;enumeration value="DICTIONARY_NOT_EXIST"/>
 *     &lt;enumeration value="EMPTY_DIMENSION_NAME"/>
 *     &lt;enumeration value="EMPTY_DIMENSION_TYPE"/>
 *     &lt;enumeration value="EMPTY_DIMENSION_SEPARATED_TABLE"/>
 *     &lt;enumeration value="EMPTY_DIMENSION_IS_DELETED"/>
 *     &lt;enumeration value="EMPTY_DIMENSION_VALUE_TYPE"/>
 *     &lt;enumeration value="NON_EXISTING_DATA_SOURCE_CODE"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="EMPTY_FACTS"/>
 *     &lt;enumeration value="MISSING_DATE"/>
 *     &lt;enumeration value="NON_UNIQUE_FACT_TYPE_CODE"/>
 *     &lt;enumeration value="NON_EXISTING_FACT_TYPE_CODE"/>
 *     &lt;enumeration value="NON_EXISTING_FACT_VALUE_TYPE_CODE"/>
 *     &lt;enumeration value="EMPTY_DIMENSIONS"/>
 *     &lt;enumeration value="AMBIGIOUS_DIMENSION_REFERENCE"/>
 *     &lt;enumeration value="MISSING_DIMENSION_VALUE"/>
 *     &lt;enumeration value="NON_EXISTING_DIMENSION_CODE"/>
 *     &lt;enumeration value="AMBIGIOUS_DIMENSION_REFERENCE"/>
 *     &lt;enumeration value="NON_EXISTING_DIMENSION_IN_FACT_TABLE"/>
 *     &lt;enumeration value="MISSING_REFERENCE_LINK_IN_DIMENSION"/>
 *     &lt;enumeration value="NON_EXISTING_EVENT_TYPE_CODE"/>
 *     &lt;enumeration value="NON_EXISTING_DIMENSION_ITEM_CODE"/>
 *     &lt;enumeration value="DIMENSION_CONFLICT_WITH_SEPARATED_TABLE_USAGE"/>
 *     &lt;enumeration value="NOT_ENOUGH_DIMENSIONS"/>
 *     &lt;enumeration value="EMPTY_EGE_REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {


    /**
     * Обнаружено неуникальное значение 
     * 
     */
    NON_UNIQUE_DATA_SOURCE_CODE("NON_UNIQUE_DATA_SOURCE_CODE"),

    /**
     * Ошибка при построении пути к файлам с результатами экзаменов
     * 
     */
    PATH_TO_FILE_EXCEPTION("PATH_TO_FILE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент Dimensions 
     * 
     */
    EMPTY_DIMENSIONS_EXCEPTION("EMPTY_DIMENSIONS_EXCEPTION"),

    /**
     * Недопустимое значение региона
     * 
     */
    WRONG_REGION_EXCEPTION("WRONG_REGION_EXCEPTION"),

    /**
     * Отсутствует запрос на апелляцию APPEAL REQUEST 
     * 
     */
    EMPTY_APPEAL_REQUEST_EXCEPTION("EMPTY_APPEAL_REQUEST_EXCEPTION"),

    /**
     * Отсутствует запрос на отмену апелляции APPEAL CANCEL REQUEST 
     * 
     */
    EMPTY_APPEAL_CANCEL_REQUEST_EXCEPTION("EMPTY_APPEAL_CANCEL_REQUEST_EXCEPTION"),

    /**
     * Результат не найден
     * 
     */
    NOT_FOUND("NOT_FOUND"),

    /**
     * Отсутствует, либо пуст обязательный элемент DICTIONARY_CONTENT_REQUEST
     * 
     */
    EMPTY_DICTIONARY_CONTENT_REQUEST("EMPTY_DICTIONARY_CONTENT_REQUEST"),

    /**
     * Отсутствует, либо пуст обязательный элемент NEW_REQUEST
     * 
     */
    EMPTY_REQUEST("EMPTY_REQUEST"),

    /**
     * Тип запроса неизвестен
     * 
     */
    UNKNOWN_REQUEST_EXCEPTION("UNKNOWN_REQUEST_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент SERVICE_CODE 
     * 
     */
    EMPTY_SERVICE_CODE_EXCEPTION("EMPTY_SERVICE_CODE_EXCEPTION"),

    /**
     * Неверный формат элемента EMAIL
     * 
     */
    EMAIL_FORMAT_EXCEPTION("EMAIL_FORMAT_EXCEPTION"),

    /**
     * Неверный формат элемента PHONE 
     * 
     */
    PHONE_FORMAT_EXCEPTION("PHONE_FORMAT_EXCEPTION"),

    /**
     * Неверный формат элемента PASSPORT_SERIES 
     * 
     */
    @XmlEnumValue("PASSPORT_SERIES_FORMAT__EXCEPTION")
    PASSPORT_SERIES_FORMAT_EXCEPTION("PASSPORT_SERIES_FORMAT__EXCEPTION"),

    /**
     * Неверный формат элемента PASSPORT_NUMBER 
     * 
     */
    PASSPORT_NUMBER_FORMAT_EXCEPTION("PASSPORT_NUMBER_FORMAT_EXCEPTION"),

    /**
     * Неверный формат элемента SNILS 
     * 
     */
    SNILS_FORMAT_EXCEPTION("SNILS_FORMAT_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент SERVICE_NAME 
     * 
     */
    EMPTY_SERVICE_NAME_EXCEPTION("EMPTY_SERVICE_NAME_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент ID_APPLICATION 
     * 
     */
    EMPTY_ID_APPLICATION_EXCEPTION("EMPTY_ID_APPLICATION_EXCEPTION"),

    /**
     * Недопустимое значение DATE_APPLICATION 
     * 
     */
    WRONG_DATE("WRONG_DATE"),

    /**
     * Отсутствует, либо пуст обязательный элемент DATE_APPLICATION 
     * 
     */
    EMPTY_DATE_APPLICATION_EXCEPTION("EMPTY_DATE_APPLICATION_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент APP_TYPE 
     * 
     */
    EMPTY_APP_TYPE_EXCEPTION("EMPTY_APP_TYPE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент SNILS
     * 
     */
    EMPTY_SNILS_EXCEPTION("EMPTY_SNILS_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент LAST_NAME и LAST_NAME_GR 
     * 
     */
    EMPTY_LAST_NAME_EXCEPTION("EMPTY_LAST_NAME_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент FIRST_NAME и FIRST_NAME_GR 
     * 
     */
    EMPTY_FIRST_NAME_EXCEPTION("EMPTY_FIRST_NAME_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PAS_SER и PAS_SER_GR 
     * 
     */
    EMPTY_PASSPORT_SERIES_EXCEPTION("EMPTY_PASSPORT_SERIES_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PAS_NUM и PAS_NUM_GR 
     * 
     */
    EMPTY_PASSPORT_NUMBER_EXCEPTION("EMPTY_PASSPORT_NUMBER_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PAS_DATE и PAS_DATE_GR 
     * 
     */
    EMPTY_PASSPORT_DATE_EXCEPTION("EMPTY_PASSPORT_DATE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PAS_ORG и PAS_ORG_GR 
     * 
     */
    EMPTY_PASSPORT_ORG_EXCEPTION("EMPTY_PASSPORT_ORG_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент APPLICANT_EQUALS_EXAMINEE 
     * 
     */
    EMPTY_APPLICANT_EQUALS_EXAMINEE_EXCEPTION("EMPTY_APPLICANT_EQUALS_EXAMINEE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент YEAR_EXAM 
     * 
     */
    EMPTY_YEAR_EXAM_EXCEPTION("EMPTY_YEAR_EXAM_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент CODE_SUBJECT 
     * 
     */
    EMPTY_CODE_SUBJECT_EXCEPTION("EMPTY_CODE_SUBJECT_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент SUBJECT_TEXT 
     * 
     */
    EMPTY_SUBJECT_TEXT_EXCEPTION("EMPTY_SUBJECT_TEXT_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент EXAM_DATE 
     * 
     */
    EMPTY_EXAM_DATE_EXCEPTION("EMPTY_EXAM_DATE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент CODE_SCHOOL 
     * 
     */
    EMPTY_CODE_SCHOOL_EXCEPTION("EMPTY_CODE_SCHOOL_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент SCHOOL_TEXT 
     * 
     */
    EMPTY_SCHOOL_TEXT_EXCEPTION("EMPTY_SCHOOL_TEXT_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент CODE_PLACE_EXAM 
     * 
     */
    EMPTY_CODE_PLACE_EXAM_EXCEPTION("EMPTY_CODE_PLACE_EXAM_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PLACE_EXAM 
     * 
     */
    EMPTY_PLACE_EXAM_EXCEPTION("EMPTY_PLACE_EXAM_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PRESENCE 
     * 
     */
    EMPTY_PRESENCE_EXCEPTION("EMPTY_PRESENCE_EXCEPTION"),

    /**
     * Отсутствует, либо пуст обязательный элемент PRESENCE_TEXT 
     * 
     */
    EMPTY_PRESENSE_TEXT_EXCEPTION("EMPTY_PRESENSE_TEXT_EXCEPTION"),

    /**
     * Отсутствует справочник с таким именем 
     * 
     */
    DICTIONARY_NOT_EXIST("DICTIONARY_NOT_EXIST"),

    /**
     * Отсутствует, либо пуст обязательный элемент DimensionName 
     * 
     */
    EMPTY_DIMENSION_NAME("EMPTY_DIMENSION_NAME"),

    /**
     * Отсутствует, либо пуст обязательный элемент DimensionType 
     * 
     */
    EMPTY_DIMENSION_TYPE("EMPTY_DIMENSION_TYPE"),

    /**
     * Отсутствует, либо пуст обязательный элемент Dimension hasSeparatedTable 
     * 
     */
    EMPTY_DIMENSION_SEPARATED_TABLE("EMPTY_DIMENSION_SEPARATED_TABLE"),

    /**
     * Отсутствует, либо пуст обязательный элемент Dimension isDeleted 
     * 
     */
    EMPTY_DIMENSION_IS_DELETED("EMPTY_DIMENSION_IS_DELETED"),

    /**
     * Отсутствует, либо пуст обязательный элемент Dimension ValueType 
     * 
     */
    EMPTY_DIMENSION_VALUE_TYPE("EMPTY_DIMENSION_VALUE_TYPE"),

    /**
     * Указанный DatasourceCode не существует
     * 
     */
    NON_EXISTING_DATA_SOURCE_CODE("NON_EXISTING_DATA_SOURCE_CODE"),

    /**
     * Произошла внутренняя ошибка
     * 
     */
    INTERNAL_ERROR("INTERNAL_ERROR"),

    /**
     * Отсутствует, либо пуст обязательный элемент Facts
     * 
     */
    EMPTY_FACTS("EMPTY_FACTS"),

    /**
     * Отсутствует обязательный элемент DATE_ELEMENT
     * 
     */
    MISSING_DATE("MISSING_DATE"),

    /**
     * Обнаружен неуникальное значение FactTypeCode
     * 
     */
    NON_UNIQUE_FACT_TYPE_CODE("NON_UNIQUE_FACT_TYPE_CODE"),

    /**
     * Такой FactTypeCode = CODE не существует
     * 
     */
    NON_EXISTING_FACT_TYPE_CODE("NON_EXISTING_FACT_TYPE_CODE"),

    /**
     * Такой FactValueTypeCode = CODE не существует
     * 
     */
    NON_EXISTING_FACT_VALUE_TYPE_CODE("NON_EXISTING_FACT_VALUE_TYPE_CODE"),

    /**
     * Отсутствует, либо пуст обязательный элемент Dimensions
     * 
     */
    EMPTY_DIMENSIONS("EMPTY_DIMENSIONS"),

    /**
     * Невозможно определить измерение в таблице фактов
     * 
     */
    AMBIGIOUS_DIMENSION_REFERENCE("AMBIGIOUS_DIMENSION_REFERENCE"),

    /**
     * Отсутствует значение справочника указанного измерения без таблицы.
     * 
     */
    MISSING_DIMENSION_VALUE("MISSING_DIMENSION_VALUE"),

    /**
     * Указанный DimensionCode не существует
     * 
     */
    NON_EXISTING_DIMENSION_CODE("NON_EXISTING_DIMENSION_CODE"),

    /**
     * Указанное измерение не найдено в таблице фактов.
     * 
     */
    NON_EXISTING_DIMENSION_IN_FACT_TABLE("NON_EXISTING_DIMENSION_IN_FACT_TABLE"),

    /**
     * Отсутствует обязательный элемент ReferenceLink
     * 
     */
    MISSING_REFERENCE_LINK_IN_DIMENSION("MISSING_REFERENCE_LINK_IN_DIMENSION"),

    /**
     * Указанный EventTypeCode не существует
     * 
     */
    NON_EXISTING_EVENT_TYPE_CODE("NON_EXISTING_EVENT_TYPE_CODE"),

    /**
     * Не существует записи с указанным кодом в справочнике измерений
     * 
     */
    NON_EXISTING_DIMENSION_ITEM_CODE("NON_EXISTING_DIMENSION_ITEM_CODE"),

    /**
     * Предоставленные данные измерения конфилктуют со свойством наличия у измерения справочника
     * 
     */
    DIMENSION_CONFLICT_WITH_SEPARATED_TABLE_USAGE("DIMENSION_CONFLICT_WITH_SEPARATED_TABLE_USAGE"),

    /**
     * В факте указаны не все измерения
     * 
     */
    NOT_ENOUGH_DIMENSIONS("NOT_ENOUGH_DIMENSIONS"),

    /**
     * Отсутствует запрос на результат ЕГЭ
     * 
     */
    EMPTY_EGE_REQUEST("EMPTY_EGE_REQUEST");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

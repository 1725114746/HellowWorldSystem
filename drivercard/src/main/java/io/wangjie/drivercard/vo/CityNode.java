package io.wangjie.drivercard.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CityNode implements Serializable {
    @JsonProperty("value")
    private Integer cityId;
    @JsonProperty("label")
    private String cityname;
    @JsonProperty("children")
    private List<CityNode> subCityNodes;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public List<CityNode> getSubCityNodes() {
        return subCityNodes;
    }

    public void setSubCityNodes(List<CityNode> subCityNodes) {
        this.subCityNodes = subCityNodes;
    }
}

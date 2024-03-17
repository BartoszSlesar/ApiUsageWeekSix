package com.bard.apiusageweeksix.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "incantation",
        "effect",
        "canBeVerbal",
        "type",
        "light",
        "creator"
})
@ToString
public class Spell {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("incantation")
    private String incantation;
    @JsonProperty("effect")
    private String effect;
    @JsonProperty("canBeVerbal")
    private Boolean canBeVerbal;
    @JsonProperty("type")
    private String type;
    @JsonProperty("light")
    private String light;
    @JsonProperty("creator")
    private String creator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("incantation")
    public String getIncantation() {
        return incantation;
    }

    @JsonProperty("incantation")
    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }

    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    @JsonProperty("canBeVerbal")
    public Boolean getCanBeVerbal() {
        return canBeVerbal;
    }

    @JsonProperty("canBeVerbal")
    public void setCanBeVerbal(Boolean canBeVerbal) {
        this.canBeVerbal = canBeVerbal;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("light")
    public String getLight() {
        return light;
    }

    @JsonProperty("light")
    public void setLight(String light) {
        this.light = light;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

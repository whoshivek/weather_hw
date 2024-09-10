package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;


public class University {
    public List<String> getWeb_pages() {
        return web_pages;
    }

    public List<String> getDomains() {
        return domains;
    }

    public String getState_province() {
        return state_province;
    }

    public String getCountry() {
        return country;
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public String getName() {
        return name;
    }

    public void setWeb_pages(List<String> web_pages) {
        this.web_pages = web_pages;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(List<String> web_pages, List<String> domains, String state_province, String country, String alpha_two_code, String name) {
        this.web_pages = web_pages;
        this.domains = domains;
        this.state_province = state_province;
        this.country = country;
        this.alpha_two_code = alpha_two_code;
        this.name = name;
    }

    @JsonProperty("web_pages")
    private List<String> web_pages;



    @JsonProperty("domains")
    private List<String> domains;

    @JsonProperty("state-province")
    private String state_province;

    @JsonProperty("country")
    private String country;

    @JsonProperty("alpha_two_code")
    private String alpha_two_code;

    @JsonProperty("name")
    private String name;

}

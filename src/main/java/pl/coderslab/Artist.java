package pl.coderslab;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data // gives geeters and setters and toString
public class Artist {
    private int id;
    @JacksonXmlProperty(localName = "firstname")
    private String firstName;
    @JacksonXmlProperty(localName = "lastname")
    private String lastName;
    private String pseudonym;
    private String profession;
    @JsonProperty("active")  // in json file will be visible as active instead of alive
    @JacksonXmlProperty(localName = "alive")
    private boolean alive;
}

package application.Models;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(
        localName = "Speciality"
)
@XmlRootElement(
        name = "Speciality"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="speciality")
public class Speciality implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    @JacksonXmlProperty(
            localName = "id"
    )
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id = null;
    @JsonProperty("name")
    @JacksonXmlProperty(
            localName = "name"
    )
    private String name = null;
    @JsonProperty("code")
    @JacksonXmlProperty(
            localName = "code"
    )
    private Long code = null;

    public Speciality() {
    }

    public Speciality id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Speciality name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality code(Long code) {
        this.code = code;
        return this;
    }

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Speciality speciality = (Speciality)o;
            return Objects.equals(this.id, speciality.id) && Objects.equals(this.name, speciality.name) && Objects.equals(this.code, speciality.code);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.code});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Speciality {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    code: ").append(this.toIndentedString(this.code)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

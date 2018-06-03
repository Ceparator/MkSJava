package application.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(
        localName = "Discipline"
)
@XmlRootElement(
        name = "Discipline"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Discipline implements Serializable {
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

    public Discipline() {
    }

    public Discipline id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Discipline name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Discipline discipline = (Discipline)o;
            return Objects.equals(this.id, discipline.id) && Objects.equals(this.name, discipline.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Discipline {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

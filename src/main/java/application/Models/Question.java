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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(
        localName = "Question"
)
@XmlRootElement(
        name = "Question"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Question implements Serializable {
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
    @JsonProperty("ymkId")
    @JacksonXmlProperty(
            localName = "ymkId"
    )
    private Long ymkId = null;

    public Question() {
    }

    public Question id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question name(String name) {
        this.name = name;
        return this;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question ymkId(Long ymkId) {
        this.ymkId = ymkId;
        return this;
    }


    public Long getYmkId() {
        return this.ymkId;
    }

    public void setYmkId(Long ymkId) {
        this.ymkId = ymkId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Question question = (Question)o;
            return Objects.equals(this.id, question.id) && Objects.equals(this.name, question.name) && Objects.equals(this.ymkId, question.ymkId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.ymkId});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Question {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    ymkId: ").append(this.toIndentedString(this.ymkId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

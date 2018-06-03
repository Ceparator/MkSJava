package application.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(
        localName = "SimpleAnswer"
)
@XmlRootElement(
        name = "SimpleAnswer"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleAnswer implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("text")
    @JacksonXmlProperty(
            localName = "text"
    )
    private String text = null;

    public SimpleAnswer() {
    }


    public SimpleAnswer text(String text) {
        this.text = text;
        return this;
    }


    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SimpleAnswer simpleAnswer = (SimpleAnswer) o;
            return Objects.equals(this.text, simpleAnswer.text);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.text});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleText {\n");
        sb.append("    text: ").append(this.toIndentedString(this.text)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

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
        localName = "Work"
)
@XmlRootElement(
        name = "Work"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Work implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    @JacksonXmlProperty(
            localName = "id"
    )
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id = null;
    @JsonProperty("workType")
    @JacksonXmlProperty(
            localName = "workType"
    )
    private String workType = null;
    @JsonProperty("hours")
    @JacksonXmlProperty(
            localName = "hours"
    )
    private Long hours = null;
    @JsonProperty("week")
    @JacksonXmlProperty(
            localName = "week"
    )
    private Long week = null;
    @JsonProperty("ymkId")
    @JacksonXmlProperty(
            localName = "ymkId"
    )
    private Long ymkId = null;

    public Work() {
    }

    public Work id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Work workType(String workType) {
        this.workType = workType;
        return this;
    }

    public String getWorkType() {
        return this.workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Work hours(Long hours) {
        this.hours = hours;
        return this;
    }

    public Long getHours() {
        return this.hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public Work week(Long week) {
        this.week = week;
        return this;
    }

    public Long getWeek() {
        return this.week;
    }

    public void setWeek(Long week) {
        this.week = week;
    }

    public Work ymkId(Long ymkId) {
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
            Work work = (Work)o;
            return Objects.equals(this.id, work.id) && Objects.equals(this.workType, work.workType) && Objects.equals(this.hours, work.hours) && Objects.equals(this.week, work.week) && Objects.equals(this.ymkId, work.ymkId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.workType, this.hours, this.week, this.ymkId});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Work {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    workType: ").append(this.toIndentedString(this.workType)).append("\n");
        sb.append("    hours: ").append(this.toIndentedString(this.hours)).append("\n");
        sb.append("    week: ").append(this.toIndentedString(this.week)).append("\n");
        sb.append("    ymkId: ").append(this.toIndentedString(this.ymkId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

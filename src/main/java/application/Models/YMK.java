package application.Models;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(
        localName = "YMK"
)
@XmlRootElement(
        name = "YMK"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class YMK implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    @JacksonXmlProperty(
            localName = "id"
    )
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id = null;
    @JsonProperty("discipline")
    @JacksonXmlProperty(
            localName = "discipline"
    )
    private Long discipline = null;
    @JsonProperty("speciality")
    @JacksonXmlProperty(
            localName = "speciality"
    )
    private Long speciality = null;
    @JsonProperty("questions")
    @JacksonXmlProperty(
            localName = "questions"
    )
    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> questions = null;
    @JsonProperty("works")
    @JacksonXmlProperty(
            localName = "works"
    )
    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> works = null;

    public YMK() {
    }

    public YMK id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public YMK discipline(Long discipline) {
        this.discipline = discipline;
        return this;
    }


    @NotNull
    public Long getDiscipline() {
        return this.discipline;
    }

    public void setDiscipline(Long discipline) {
        this.discipline = discipline;
    }

    public YMK speciality(Long speciality) {
        this.speciality = speciality;
        return this;
    }

    @NotNull
    public Long getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(Long speciality) {
        this.speciality = speciality;
    }

    public YMK questions(List<Integer> questions) {
        this.questions = questions;
        return this;
    }

    public YMK addQuestionsItem(Integer questionsItem) {
        if (this.questions == null) {
            this.questions = new ArrayList();
        }

        this.questions.add(questionsItem);
        return this;
    }

    public List<Integer> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Integer> questions) {
        this.questions = questions;
    }

    public YMK works(List<Integer> works) {
        this.works = works;
        return this;
    }

    public YMK addWorksItem(Integer worksItem) {
        if (this.works == null) {
            this.works = new ArrayList();
        }

        this.works.add(worksItem);
        return this;
    }

    public List<Integer> getWorks() {
        return this.works;
    }

    public void setWorks(List<Integer> works) {
        this.works = works;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            YMK YMK = (YMK)o;
            return Objects.equals(this.id, YMK.id) && Objects.equals(this.discipline, YMK.discipline) && Objects.equals(this.speciality, YMK.speciality) && Objects.equals(this.questions, YMK.questions) && Objects.equals(this.works, YMK.works);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.discipline, this.speciality, this.questions, this.works});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class YMK {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    discipline: ").append(this.toIndentedString(this.discipline)).append("\n");
        sb.append("    speciality: ").append(this.toIndentedString(this.speciality)).append("\n");
        sb.append("    questions: ").append(this.toIndentedString(this.questions)).append("\n");
        sb.append("    works: ").append(this.toIndentedString(this.works)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

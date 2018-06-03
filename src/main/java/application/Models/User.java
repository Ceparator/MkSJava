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
        localName = "User"
)
@XmlRootElement(
        name = "User"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    @JacksonXmlProperty(
            localName = "id"
    )
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id = null;
    @JsonProperty("username")
    @JacksonXmlProperty(
            localName = "username"
    )
    private String username = null;
    @JsonProperty("firstName")
    @JacksonXmlProperty(
            localName = "firstName"
    )
    private String firstName = null;
    @JsonProperty("lastName")
    @JacksonXmlProperty(
            localName = "lastName"
    )
    private String lastName = null;
    @JsonProperty("password")
    @JacksonXmlProperty(
            localName = "password"
    )
    private String password = null;
    @JsonProperty("phone")
    @JacksonXmlProperty(
            localName = "phone"
    )
    private String phone = null;
    @JsonProperty("role")
    @JacksonXmlProperty(
            localName = "role"
    )
    private String role = null;

    public User() {
    }

    public User id(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User role(String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            User user = (User)o;
            return Objects.equals(this.id, user.id) && Objects.equals(this.username, user.username) && Objects.equals(this.firstName, user.firstName) && Objects.equals(this.lastName, user.lastName) && Objects.equals(this.password, user.password) && Objects.equals(this.phone, user.phone) && Objects.equals(this.role, user.role);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.username, this.firstName, this.lastName, this.password, this.phone, this.role});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    username: ").append(this.toIndentedString(this.username)).append("\n");
        sb.append("    firstName: ").append(this.toIndentedString(this.firstName)).append("\n");
        sb.append("    lastName: ").append(this.toIndentedString(this.lastName)).append("\n");
        sb.append("    password: ").append(this.toIndentedString(this.password)).append("\n");
        sb.append("    phone: ").append(this.toIndentedString(this.phone)).append("\n");
        sb.append("    role: ").append(this.toIndentedString(this.role)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

package taki.Bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userBD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, surname, patronymic;
    private float number_card;
    private int valid_thru;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public float getNumber_card() {
        return number_card;
    }

    public void setNumber_card(float number_card) {
        this.number_card = number_card;
    }

    public int getValid_thru() {
        return valid_thru;
    }

    public void setValid_thru(int valid_thru) {
        this.valid_thru = valid_thru;
    }
}
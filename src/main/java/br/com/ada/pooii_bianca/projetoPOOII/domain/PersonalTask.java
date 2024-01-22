package br.com.ada.pooii_bianca.projetoPOOII.domain;
import java.util.Date;
public class PersonalTask extends BaseTask{
    private String personalNote;

    //Construtor, getters e setters:

    public String getPersonalNote() {
        return personalNote;
    }

    public void setPersonalNote(String personalNote) {
        this.personalNote = personalNote;
    }

    public PersonalTask(String title, String description, Date deadline, String personalNote){
        super (title, description, deadline);
        this.personalNote = personalNote;
    }
}

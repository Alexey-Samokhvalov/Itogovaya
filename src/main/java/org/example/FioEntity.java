package org.example;

import lombok.Data;

@Data
public class FioEntity {

    private String Lastname;
    private String Name;
    private String Surname;

    @Override
    public String toString() {
        return Lastname+" "+ Name +" "+Surname;
    }
}

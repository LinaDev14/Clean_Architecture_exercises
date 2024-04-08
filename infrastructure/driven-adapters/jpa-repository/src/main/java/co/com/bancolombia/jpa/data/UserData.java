package co.com.bancolombia.jpa.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@Table(name = "User")
@NoArgsConstructor
public class UserData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @NonNull
    private String name;
    @NonNull
    private boolean email;

    @NonNull
    private boolean password;




}

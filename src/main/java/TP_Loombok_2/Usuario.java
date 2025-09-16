package TP_Loombok_2;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    private int id;
    private String name;
    private String email;
}

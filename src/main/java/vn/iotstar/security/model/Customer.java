package vn.iotstar.security.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    private String id;
    private String name;
    private  String phonenumber;
    private String email;
}

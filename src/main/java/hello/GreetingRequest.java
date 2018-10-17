package hello;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by amitsethi on 17/10/2018.
 */
@Data
@Setter
@Getter
public class GreetingRequest {

    private String name;

}

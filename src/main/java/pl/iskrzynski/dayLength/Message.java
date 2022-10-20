package pl.iskrzynski.dayLength;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String message;
    public Message (String aMessage){
        this.message = aMessage;
    }
}

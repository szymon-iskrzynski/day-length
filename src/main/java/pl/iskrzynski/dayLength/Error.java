package pl.iskrzynski.dayLength;


public class Error implements Response {
    public final Message message;

    public Error() {
        this.message = new Message("Error");
    }

}

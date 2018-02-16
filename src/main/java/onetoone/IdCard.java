package onetoone;

/**
 * Created by panyi on 2018/2/12.
 */
public class IdCard {
    private String cardNo;
    private Person person;

    @Override
    public String toString() {
        return "IdCard{" +
                "cardNo='" + cardNo + '\'' +
                ", person=" + person +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}

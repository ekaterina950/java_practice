import java.util.StringTokenizer;

public class Address {
    private String county, region, city, street, houseNumber, corpNumber, flatNumber;
    Address (String address, boolean isSeparatorComma) {
        String[] strings;
        if (isSeparatorComma)
            strings = address.split(", ");
        else {
            address = " " + address;
            StringTokenizer st = new StringTokenizer(address, ".,;");// строка на части с разделителями
            strings = new String[7];
            for (int i = 0; st.hasMoreTokens(); i++) {// если еще есть слова то тру
                strings[i] = st.nextToken().substring(1);//возвращает строку на которую указывает токенайзер
            }
        }
        this.county = strings[0];
        this.city = strings[1];
        this.region = strings[2];
        this.street = strings[3];
        this.houseNumber = strings[4];
        this.corpNumber = strings[5];
        this.flatNumber = strings[6];
    }
    Address (String address) {
        new Address(address, false);
    }

    @Override
    public String toString() {
        return "Address{" +
                "county='" + county + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", corpNumber='" + corpNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}

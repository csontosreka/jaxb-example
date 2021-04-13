package movie;

import java.time.Year;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class YearAdapter extends XmlAdapter<String, Year> {

    @Override
    public Year unmarshal(String s) throws Exception {
        return Year.parse(s);
    }

    @Override
    public String marshal(Year year) throws Exception {
        return year.toString();
    }

}
